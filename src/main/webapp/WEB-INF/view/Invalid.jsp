<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreditCard-Invalid</title>
</head>
<body>
<div id="msg">Invalid PAN Entry!!!</div><br>
<%String pathWebcontent=request.getContextPath();%>
<a href="<%=pathWebcontent%>/">Enter Again</a>
</body>
</html>