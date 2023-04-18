<%@ page import="java.util.ArrayList" %>
<%
var list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello ArrayList</title>
</head>
<body>
    <%
        for(int i : list)
            out.print(i + "<br>");
    %>
</body>
</html>