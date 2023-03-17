package local.onlits2001.servlet;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello World!");
    }
}
