<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 3/3/2020
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ page import="com.sadman.model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Record</title>
</head>
<body>
<%
    if (request.getAttribute("studentRecord") != null) {
        Student student = (Student) request.getAttribute("studentRecord");
%>

<h1>Student Record</h1>
<div>
    ID:
    <%=student.getId()%></div>
<div>
    First Name:
    <%=student.getFirstName()%></div>
<div>
    Last Name:
    <%=student.getLastName()%></div>

<%
} else {
%>
<h1>No student record found.</h1>
<%
    }
%>
</body>
</html>
