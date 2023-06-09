package local.onlits2001.todoapp;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Todo {
    private long id;
    private String description;
    private boolean completedStatus;

    private Connection connection;
    private Statement statement;

    Todo() {
        description = "Revise topics on ORM";
        completedStatus = true;

        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/todo_app", "onlits2001", "onlits2001");
            statement = connection.createStatement();
        } catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCompletedStatus(boolean completedStatus) {
        this.completedStatus = completedStatus;
    }

    public boolean getCompletedStatus() {
        return completedStatus;
    }

    public void create() {
        try{
            String sql = "INSERT INTO todo (description, completed_status) VALUES ('" + description + "','" + completedStatus + "')";
            statement.executeUpdate(sql);
            System.out.println("Data Inserted System!");
        } catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void read() {

    }

    public void read(long id) {

    }

    public void update(long id) {

    }

    public void delete(long id) {

    }

    public static void main(String[] args) {
        Todo todo = new Todo();
        todo.setDescription("Write notes on servlet");
        todo.setCompletedStatus(false);
        todo.create();
    }
}
