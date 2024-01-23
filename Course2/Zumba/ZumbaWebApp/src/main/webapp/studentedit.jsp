<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Student</title>
</head>
<body>
<a href="instructor.jsp">Return</a>

<center>
<h3>Add new student</h3>
<form action="EditStudent" method="post">
<input type="hidden" name="id" />
Enter Student Name: <br/>
<input type="text" name="stdName" /><br />
Enter Student Email: <br/>
<input type="text" name="stdEmail" /><br />
Enter Student Phone: <br/>
<input type="phone" name="stdPhone" /><br />
Enter Student Age: <br/>
<input type="text" name="stdAge" /><br />
Add Student To Batch:
<select>
<%

%>
</select><br />
<input type="submit" value="Submit" />
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
</tr>
<%

%>
</table>
</center>

</body>
</html>