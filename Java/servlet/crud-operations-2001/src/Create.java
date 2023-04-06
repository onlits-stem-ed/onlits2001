package local.onlits2001.crud;

import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Create extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/crud_test_2201", "onlits2001", "onlits2001");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student(name) VALUES('" + request.getParameter("name") + "')";
            statement.executeUpdate(sql);
            out.println("Data inserted successfully!");
        } catch(SQLException ex) {
            System.out.println(ex.toString());
        }
        out.println("Till here aal is well!");
    }
}
