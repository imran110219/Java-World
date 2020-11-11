<%--
  Created by IntelliJ IDEA.
  User: Imran
  Date: 3/21/2020
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet</title>
</head>
<body>
    <a href="servlet">Click here to call Servlet</a>
    <br>
    <a href="generic">Click here to call Generic Servlet</a>
    <br>
    <a href="http">Click here to call Http Servlet</a>
    <br>
    <p>Click below to submit form</p>
    <form action = "form" method = "GET">
        First Name: <input type = "text" name = "first_name">
        <br />
        Last Name: <input type = "text" name = "last_name" />
        <input type = "submit" value = "Submit" />
    </form>
</body>
</html>
