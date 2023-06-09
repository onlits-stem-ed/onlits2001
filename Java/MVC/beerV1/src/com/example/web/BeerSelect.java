package com.example.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import com.example.model.BeerExpert;
import java.util.*;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String c = request.getParameter("color");
        
        BeerExpert beerExpert = new BeerExpert();
        List<String> result = beerExpert.getBrands(c);
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}