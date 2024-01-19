<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.fullstack.db.DB"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="jakarta.servlet.http.Cookie"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Results</title>
</head>
<body>
	<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	DB db = new DB();
	String sql = "SELECT * FROM User WHERE email =? and password=?";
	PreparedStatement ps = db.getConnection().prepareStatement(sql);
	ps.setString(1, email);
	ps.setString(2, password);
	ResultSet set = ps.executeQuery();

	Cookie cookie = new Cookie("user_email", email);

	HttpSession sess = request.getSession();

	if (set != null && set.next()){
		sess.setAttribute("user_email", email);
		sess.getCreationTime();
		sess.invalidate();
	
	%>
	<jsp:forward page="login.jsp"></jsp:forward>
	<%
	}else{
	%>
	<b>Login incorrect!!!</b>
	<%
	} 
	%>


</body>
</html>