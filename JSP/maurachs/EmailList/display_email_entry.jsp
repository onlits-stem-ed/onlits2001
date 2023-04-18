<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Murach's Java Servlets and JSP</title>
</head>

<body>
    <!-- import packages and classes needed by the scripts -->
    <%@ page import="business.User, data.UserIO" %>
    <% 
        // get parameters from the request
    
        String firstName=request.getParameter("firstName"); 
        String lastName=request.getParameter("lastName"); 
        String emailAddress=request.getParameter("emailAddress");

        //get the real path for the EmailList.txt file
        ServletContext sc = this.getServletContext();
        String path = sc.getRealPath("/WEB-INF/EmailList.txt");

        // use regular Java Objects
        User user = new User(firstName, lastName, emailAddress);
        UserIO.add(user, path);
    %>

        <h1>Thanks for joining our email list</h1>

        <p>Here is the information that you entered:</p>

        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">Frist Name:</td>
                <td><%= user.getFirstName() %></td>
            </tr>
            <tr>
                <td align="right">Last Name:</td>
                <td><%= user.getLastName() %></td>
            </tr>
            <tr>
                <td align="right">Email Address:</td>
                <td><%= user.getEmailAddress() %></td>
            </tr>
        </table>

        <p>To enter another email address, click on the Back <br>
        button in you browser or the Return button shown <br>
        below.</p>

        <form action="index.html" method="post">
            <input type="submit" value="Return">
        </form>
</body>

</html>