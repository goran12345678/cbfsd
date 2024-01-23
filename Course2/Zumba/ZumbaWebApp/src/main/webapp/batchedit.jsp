<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Batch</title>
</head>
<body>
<a href="instructor.jsp">Return</a>
	<center>
		<h3>Create New Batch</h3>
		<form action="EditBatch" method="post">
		<input type="hidden" name="id" />
		Enter Batch Name: <br />
			<input type="text" name="batName"><br />
			Enter Batch Start Date: <br /> 
			<input type="date" name="batDate"><br />
			Enter Batch Start Time: <br /> 
			<input type="time" name="batTime"><br />
			Enter Batch Duration (minutes): <br /> 
			<input type="text" name="batDuration" /><br /> 
			Enter the Max Capacity: <br />
			<input type="text" name="batMaxCapacity" value="30" /><br />
			<select>
				<%
%>
			</select><br />
			<input type="submit" value="Submit" />
		</form>
	</center>
	<hr />
	<center>
		<h3>Edit Batch</h3>
		<table>
			<tr>
				<th>Name</th>
				<th>Start Date</th>
				<th>Start Time</th>
				<th>Minutes of Session</th>
				<th>Enrolled Students</th>
			</tr>
			<%
%>
		</table>
	</center>
</body>
</html>