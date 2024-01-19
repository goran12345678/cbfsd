<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
 <%@ page isErrorPage="true" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>An Error Has Occurred</title>
</head>
<body>
<b>Sorry things didn't work out. Try again in a few minutes.</b>

Exception: <%=exception %> <br />

Message: <%=exception.getMessage() %>

</body>
</html>