package local.onlits2001.myblog.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import local.onlits2001.myblog.model.Todo;

public class TodoCreate extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Todo todo = new Todo();
        todo.setDescription(request.getParameter("description"));
        todo.create();
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
