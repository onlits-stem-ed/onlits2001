package local.onlits.onlits2001.servlet;

// import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;

public class HelloWorld extends HttpServlet{
    public void init() {
        System.out.println("Servlet initialized!");
    }

    // public void destroy() {
    //     System.out.println("Servlet destroyed!");
    // }
}