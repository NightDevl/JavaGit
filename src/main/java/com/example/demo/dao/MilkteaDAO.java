package com.example.demo.dao;

import com.example.demo.model.MilkteaModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MilkteaDAO extends ConnectDB {
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(ConnectDB.url,ConnectDB.user,ConnectDB.pw);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<MilkteaModel> getAllMilktea() throws Exception {
        List<MilkteaModel> list = new ArrayList<>();
        String sql = "SELECT * FROM milktea";
        try (
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                list.add(new MilkteaModel(resultSet.getInt("id"),
                        resultSet.getString("code"),
                        resultSet.getString("image"),
                        resultSet.getString("name"),
                        resultSet.getString("size"),
                        resultSet.getInt("price"),
                        resultSet.getString("typeofTea"),
                        resultSet.getInt("mlTea"),
                        resultSet.getInt("condensedMilk"),
                        resultSet.getString("typeofSyrup"),
                        resultSet.getInt("mlSyrup")));
            }
        }
        return list;
    }

}
