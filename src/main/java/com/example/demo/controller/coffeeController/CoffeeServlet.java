package com.example.demo.controller.coffeeController;

import com.example.demo.dao.CoffeeDAO;
import com.example.demo.dao.FruitteaDAO;
import com.example.demo.model.CoffeeModel;
import com.example.demo.model.FruitteaModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Coffee", value = "/coffee")
public class CoffeeServlet extends HttpServlet {
    private CoffeeDAO coffeeDAO;

    public void init() {
        coffeeDAO = new CoffeeDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<CoffeeModel> list = coffeeDAO.getAllCoffee();
            request.setAttribute("listCoffee", list);
            request.getRequestDispatcher("coffee.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");
            String id = req.getParameter("sid");
            coffeeDAO.deleteCoffee(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
