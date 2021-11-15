package com.example.demo.controller;

import com.example.demo.dao.FruitteaDAO;
import com.example.demo.model.FruitteaModel;
import com.example.demo.model.MilkteaModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Fruittea", value = "/fruittea")
public class FruitteaServlet extends HttpServlet {
    private FruitteaDAO fruitteaDAO;

    @Override
    public void init() {
        fruitteaDAO = new FruitteaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<FruitteaModel> list = fruitteaDAO.getAllFruittea();
            request.setAttribute("listFruittea", list);
            request.getRequestDispatcher("fruittea.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
