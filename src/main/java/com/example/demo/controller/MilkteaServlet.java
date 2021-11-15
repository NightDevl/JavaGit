package com.example.demo.controller;

import com.example.demo.dao.MilkteaDAO;
import com.example.demo.model.MilkteaModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Milktea", value = "/milktea")
public class MilkteaServlet extends HttpServlet {
    private MilkteaDAO milkteaDAO;

    @Override
    public void init() {
        milkteaDAO = new MilkteaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<MilkteaModel> list = milkteaDAO.getAllMilktea();
            request.setAttribute("listMilktea", list);
            request.getRequestDispatcher("milktea.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
