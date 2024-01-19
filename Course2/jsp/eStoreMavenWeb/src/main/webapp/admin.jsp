<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.fullstack.db.DB"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<jsp:useBean id="user1" class="com.fullstack.model.User" />
<jsp:setProperty property="email" name="user1" value="<%= email %>"/>
<jsp:setProperty property="name" name="user1" value="<%= name %>"/>

<h3>Bean message <%=user1%></h3>

	<center>
	<h3>Hello <b style="color:yellow"><jsp:getProperty property="name" name="user1"/></b> there are the current users</h3>
		<table style="border: 1px solid grey">
			<tr >
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th></th>
			</tr>
			<%
			DB db = new DB();

			String sql = "SELECT * FROM User";
			PreparedStatement ps = db.getConnection().prepareStatement(sql);

			ResultSet set = ps.executeQuery();

			while (set.next()) {
			%>
			<tr>
				<td><%=set.getString("uid")%></td>
				<td><%=set.getString("name")%></td>
				<td><%=set.getString("email")%></td>
				<td><%=set.getString("password")%></td>
				<td><a href="delete.jsp?id=<%= set.getString("uid")%>" >Delete</a></td>
				
			</tr>
			<%
}
%>

<%!

String name = "goran";
String email = "goran@gmail.com";

%>

		</table>
	</center>

</body>
</html>