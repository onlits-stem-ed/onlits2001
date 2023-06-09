<%@ page import="local.onlits2001.myblog.model.Todo" %>
    <% var todos=new Todo().read(); %>
        <html>

        <body>
            <h1>Todo App Home</h1>
            <p><a href="create.jsp">New Todo Item</a></p>
            <table border="1">
                <tr>
                    <th>Id</th>
                    <th>Description</th>
                    <th>Completed</th>
                </tr>
                <%for(Todo todo : todos) {%>
                    <tr>
                        <td><%out.print(todo.getId());%></td>
                        <td><%out.print(todo.getDescription());%></td>
                        <td><%out.print(todo.getCompletedStatus());%></td>
                    </tr>
                <%}%>
            </table>
        </body>

        </html>