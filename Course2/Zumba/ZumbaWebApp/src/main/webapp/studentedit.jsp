<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ page import="com.zumbapro.model.Student" %>
	<%@ page import="java.util.ArrayList" %>
	
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Student</title>
</head>
<body>
	<a href="instructor.jsp">Return</a>

<%
ArrayList<Student> student = (ArrayList<Student>) request.getAttribute("student");

%>
	<center>
		<h3>Add new student</h3>
		<form action="EditStudent" method="post">
			<input type="hidden" name="stdId" value="<%=(student != null) ? student.get(0).getId(): "" %>"/>
			 Enter Student Name: <br /> 
			 <input	type="text" name="stdName" value="<%=(student != null) ? student.get(0).getName(): "" %>"/><br />
			 Enter Student Email: <br />
			 <input	type="text" name="stdEmail" value="<%=(student != null) ? student.get(0).getEmail(): "" %>"/><br />
			  Enter Student Phone: <br /> 
			  <input type="phone" name="stdPhone" value="<%=(student != null) ? student.get(0).getPhone(): "" %>"/><br />
			   Enter Student Age: <br />
			    <input	type="text" name="stdAge" value="<%=(student != null) ? student.get(0).getAge(): "" %>"/><br />
			     Add Student To Batch: 
			     <select>
			</select><br />
			<c:choose>
			<c:when test="<%=student != null %>">
			 <input type="submit" value="Edit" />
			 <a href="GetStudent" >Cancel</a>
			 </c:when>
			 <c:otherwise>
			 <input type="submit" value="Submit" />
			 </c:otherwise>
			 </c:choose>
		</form>
	</center>

	<hr />
	<center>
		<h3>Edit student</h3>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Age</th>
				<th></th>
			</tr>
			<%
				ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students"); //casting 
				if(students != null){
				for(Student s: students)
				{
			%>
			<tr>
			<td><%=s.getId() %></td>
			<td><%=s.getName() %></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getPhone() %></td>
			<td><%=s.getAge() %></td>
			<td><a href="GetStudent?id=<%=s.getId() %>">Edit</a></td>
			</tr>
			<%} }%>
		</table>
	</center>

</body>
</html>