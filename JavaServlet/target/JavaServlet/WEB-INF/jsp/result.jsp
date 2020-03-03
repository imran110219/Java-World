<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 3/3/2020
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Data</title>
</head>
<body>
<h2>User Information</h2>
<p><strong>Name:</strong> ${name}</p>
<p><strong>Email:</strong> ${email}</p>
<p><strong>Province:</strong> ${province}</p>
<p><strong>Country:</strong> ${country}</p>
</body>
</html>