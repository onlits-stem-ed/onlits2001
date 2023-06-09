package local.onlits2001.todoapp;

import jakarta.http.servlet;

package TodoController extends HttpServlet {

    private Todo todo;

    TodoController() {
        todo = new Todo();
    }

    public void index() {
        String todos = todo.read();
        
    }
}