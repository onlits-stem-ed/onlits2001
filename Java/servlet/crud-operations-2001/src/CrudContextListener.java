package local.onlits2001.crud;

import jakarta.servlet.*;
import java.sql.*;

public class CrudContextListener implements ServletContextListener {
    Connection connection;
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        String url = sc.getInitParameter("url");
        String username = sc.getInitParameter("username");
        String password = sc.getInitParameter("password");
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch(SQLException ex) {}
        sc.setAttribute("connection", connection);
    }

    public void contextDestroyed(ServletContextEvent event) {
        try {
            connection.close();
        } catch(SQLException ex) {}
    }
}