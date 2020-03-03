<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 3/3/2020
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Context and Servlet Initialization  Parameters</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h2>Please fill the form below:</h2>
<form action="${pageContext.request.contextPath}/userServlet" method="post">
    <label for="name"><strong>Name:</strong></label>
    <input type="text" name="name" id="name">
    <label for="email"><strong>Email:</strong></label>
    <input type="text" name="email" id="email">
    <input type="submit" value="Send">
</form>
</body>
</html>
