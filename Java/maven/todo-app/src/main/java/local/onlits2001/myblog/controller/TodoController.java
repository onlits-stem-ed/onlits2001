package local.onlits2001.myblog.controller;

// import java.io.PrintWriter;
import jakarta.servlet.http.*;
import local.onlits2001.myblog.model.Todo;

public class TodoController extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Todo todo = new Todo();
        todo.setDescription("Prepare for JDBC assessment");
        todo.create();
    }
}
