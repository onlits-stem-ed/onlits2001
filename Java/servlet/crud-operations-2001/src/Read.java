package local.onlits2001.crud;

import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Read extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/crud_test_2201","onlits2001","onlits2001");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM student");
            out.print("<table border=1>");
            out.print("<tr>");
            out.print("<th>Admission No</th>");
            out.print("<th>Name</th>");
            out.print("</tr>");
            while(result.next()) {
                out.print("<tr>");
                out.print("<td>" + result.getInt("admission_no") + "</td>");
                out.print("<td>" + result.getString("name") + "</td>");
                out.print("</tr>");
            }
            out.print("<table>");
        } catch (SQLException ex) {
            out.println(ex.toString());
        }
        out.println("Till here aal is well!");
    }
}


// HttpServletRequest request, HttpServletResponse response