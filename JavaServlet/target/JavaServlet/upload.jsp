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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>File Upload Demo</title>
</head>

<body>
<div>Apache FileUpload</div>
<form method="post" action="uploadFile" enctype="multipart/form-data">
    Choose a file: <input type="file" name="uploadFile"/><input type="submit" value="Upload"/>
</form>

</br>

<div>Servlet Multipart</div>
<form method="post" action="multiPartServlet" enctype="multipart/form-data">
    Choose a file: <input type="file" name="multiPartServlet"/><input type="submit" value="Upload"/>
</form>
</body>
</html>
