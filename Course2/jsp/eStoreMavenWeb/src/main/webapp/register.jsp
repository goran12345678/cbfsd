<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ page import="com.fullstack.model.User" %> 
  <%@ page import="com.fullstack.db.DB" %>  
   <%@ page import="java.sql.PreparedStatement" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<%
String name = request.getParameter("txtName");
String email = request.getParameter("txtEmail");
String password = request.getParameter("txtPassword");

User user = new User();
user.setEmail(email);
user.setName(name);
user.setPassword(password);

DB db = new DB();

String sql = "INSERT INTO User VALUES(null,?,?,?)";
PreparedStatement ps = db.getConnection().prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, email);
ps.setString(3, password);

int result = db.executeUpdate(ps);

db.closeConnection();
		
//out.print("name is " + name + ", email is " + email + ", password is " + password);
if(result > 0){
	//the query succeeded
%>

<h3>Thank you for registering</h3>

<%
}else{
	//the query failed
%>

<h3>Sorry! Registration has failed</h3>

<% 
}
%>


</body>
</html>