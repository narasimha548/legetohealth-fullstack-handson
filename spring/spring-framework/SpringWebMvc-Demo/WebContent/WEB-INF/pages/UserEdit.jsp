<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Edit  User Data</h3>
		<form action = "spring/user/updateUser" method = "post">
	<!-- 	User Id : <input  type="number"  name="userId"><br/> -->
		Name: <input type = 'text' name = 'n1'    autocomplete="off"/> <br />
		Password: <input type = 'password' name = 'pwd' /> <br />
		Age: <input type = 'number' name = 'age' /> <br />
		<input type = 'submit' value = 'Update' />
	</form>
	

</body>
</html>