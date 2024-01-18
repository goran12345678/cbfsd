<html>
<body>
	<h2>Hello World!</h2>

	<%
	int a = 10;
	int b = 20;
	int c = a + b;
	out.print("c is " + c);
	%>

	
	<center>  
	<h3>Register yourself here</h3>
		<form action="register.jsp" method="post" >
			Enter Name: <br />
			 <input type="text" name="txtName" /><br />
			Enter Email: <br />
			 <input type="text" name="txtEmail" /><br />
			Enter Password: <br />
			 <input type="text" name="txtPassword" /><br />
			<input type="submit" value="Register" />
		</form>
	</center>
</body>
</html>
