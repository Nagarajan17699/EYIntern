<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
	<%
	//scriplet
	String s=request.getParameter("uname");
	LocalDateTime d=LocalDateTime.now();
	out.println(d);
	%>
	<h2>
	<% out.println(s);%>
	</h2>
	
</h1>	
	<h2><%=request.getParameter("uname") %></h2>
	
	
</body>
</html>