package local.onlits2001.myblog.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Todo {
    private int id;
    private String description;
    private int completedStatus;

    Connection connection;
    Statement statement;

    public Todo() {
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/todo_app", "onlits2001",
                    "onlits2001");
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCompletedStatus(int completedStatus) {
        this.completedStatus = completedStatus;
    }

    public int getCompletedStatus() {
        return completedStatus;
    }

    public void create() {
        String sql = "INSERT INTO todo(description, completed_status) VALUES('" + description + "', 0" + ")";
        try {
            statement.executeUpdate(sql);
            System.out.println("Create successful!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public ArrayList<Todo> read() {
        ArrayList<Todo> todos = new ArrayList<Todo>();
        String sql = "SELECT * FROM todo";
        try {
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                Todo todo = new Todo();
                todo.setId(resultset.getInt("id"));
                todo.setDescription(resultset.getString("description"));
                todo.setCompletedStatus(resultset.getInt("completed_status"));
                todos.add(todo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return todos;
    }

    public ArrayList<Todo> read(int id) {
        ArrayList<Todo> todos = new ArrayList<Todo>();
        String sql = "SELECT * FROM todo WHERE id=" + id;
        try {
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                Todo todo = new Todo();
                todo.setId(resultset.getInt("id"));
                todo.setDescription(resultset.getString("description"));
                todo.setCompletedStatus(resultset.getInt("completed_status"));
                todos.add(todo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return todos;
    }

    public void update(int id) {
        String sql = "UPDATE todo SET description='" + description + "', completed_status=" + completedStatus
                + " WHERE id=" + id;
        try {
            statement.executeUpdate(sql);
            System.out.println("Update successful!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void delete(int id) {
        String sql = "DELETE from todo WHERE id=" + id;
        try {
            statement.executeUpdate(sql);
            System.out.println("Delete Successful!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
