package local.onlits2001.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FactorialRecursion extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int n = Integer.parseInt(request.getParameter("number"));
        int f = 1;
        for (int i = n; i > 1; i--) {
            f = f * i;
        }
        out.println("<html><body>");  
        out.println("The factorial of " + n + " is " + f + ".");
        out.println("</body></html>");  
    }
}