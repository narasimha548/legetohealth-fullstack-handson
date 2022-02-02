<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Users List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
			<th>Age</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.userId}</td>
				<td>${user.name}</td>
				<td>${user.password}</td>
				<td>${user.age}</td>
				<td><a href="editById/${user.userId}">Edit</a>
				<td><a href="deleteUser/${user.userId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>