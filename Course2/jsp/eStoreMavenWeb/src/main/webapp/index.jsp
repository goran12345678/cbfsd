<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page errorPage="error.jsp" %>

<%@ taglib prefix="my" uri="WEB-INF/mytags.tld"%>

<html>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<h2>Hello World!</h2>

	<%
	
	int a = 10;
	int b = 20;
	int c = a + b;
	//out.print("c is " + c);

	HttpSession sess = request.getSession();

	if (sess.getAttribute("user_email") != null) {
		//we havde an authenicated user
	%>
	<jsp:forward page="admin.jsp"></jsp:forward>
	<%
	} else {
	%>
	<b>Please log in first</b>
	<%
	}
	%>
	<a href="admin.jsp">Admin Page</a>
	<br />
	<a href="login.jsp">Login</a>
	<center>
		<h3>Register yourself here</h3>
		<form action="register.jsp" method="post">
			Enter Name: <br /> <input type="text" name="txtName" /><br />
			Enter Email: <br /> <input type="text" name="txtEmail" /><br />
			Enter Password: <br /> <input type="text" name="txtPassword" /><br />
			<input type="submit" value="Register" />
		</form>
	</center>

	<my:Footer />
</body>
</html>
