<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- JSP Directive Elements  -->
<%@ page import="java.util.Date"%>

<!-- extend attribute identifies a base class for the JSP page  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to the JSP Page</title>
</head>
<body>

	<%
	out.println("<h3>" + greeting + "</h3>");
	int sum = sum(4, 5);
	out.println("sum is " + sum);
	%>

	<!--  This is a script element -->
	<%
	// This is a script tag
	int a = 10;
	int b = 20;
	int c = a + b;
	out.println("<h4>c is " + c + "</h4>");
	%>

	<%!//this is a declaration tag

	String greeting = "Hello world!";

	int sum(int a, int b) {
		return a + b;
	}%>
	
	<%= 
	(new Date()).toLocaleString()
	%>
	
	<h3><%=greeting%></h3>
	
	<h4><%=greeting %> <b>  the sum is</b> <%=sum(2,3) %></h4>

</body>
</html>