package com.example.demo.test;

import com.example.demo.dao.CoffeeDAO;
import com.example.demo.dao.FruitteaDAO;
import com.example.demo.dao.MilkteaDAO;
import com.example.demo.model.CoffeeModel;
import com.example.demo.model.FruitteaModel;
import com.example.demo.model.MilkteaModel;

import java.util.List;

public class test {
    public static void main(String[] args) throws Exception {
        CoffeeDAO coffeeDAO = new CoffeeDAO();
        List<CoffeeModel> list = coffeeDAO.getAllCoffee();
        for(CoffeeModel coffeeModel:list){
            System.out.println(coffeeModel);


            }
        }
    }
