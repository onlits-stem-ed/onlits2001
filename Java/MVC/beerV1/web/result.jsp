<%@ page import="java.util.*" %>

<html>
    <body>
        <h1 align="center">Beer Recomendations JSP</h1>
        <p>
            <%
                List<String> styles = (List<String>)request.getAttribute("styles");
                Iterator it = styles.iterator();
                out.println(getServletContext().getInitParameter("adminEmail"));
                while(it.hasNext()) {
                    out.println("<br>try: " + it.next());
                }
            %>
        </p>
    </body>
</html>