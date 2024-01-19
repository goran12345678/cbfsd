<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.fullstack.db.DB"%>
<%@ page import="java.sql.PreparedStatement"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete User</title>
</head>
<body>

<%

String id = request.getParameter("id");
out.print("user id " + id);

DB db = new DB();
String sql = "DELETE FROM User WHERE uid = ?";
PreparedStatement ps = db.getConnection().prepareStatement(sql);
ps.setString(1, id);

int result = ps.executeUpdate();

if(result > 0){
%>
<h3>User (<%=id %>) was deleted</h3>
<%
}else{
%>
<h3>Failed to delete user (<%=id %>)</h3>
<%
}
%>
</body>
</html>