<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prueba</title>
</head>
<body>
<p>Examen 19 abril</p>
	<%
	for (int i = 1; i < 6; i++) {
	%>
	<h1>Prueba <%= i %></h1>
	<%
	}
	%>
</body>
</html>