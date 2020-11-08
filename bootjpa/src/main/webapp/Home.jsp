<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add new Alien</h1>
	<form action="addAlien">
		<input type="text" name="aid"><br> 
		<input type="text" name="aname"><br> 
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	<br>
	<h1>Fetch alien by ID</h1>
	<form action="getAlien">
		<input type="text" name="aid"><br> 
		<input type="submit"><br>
	</form>
	<br>
	<h1>Update alien by ID</h1>
	<form action="updateAlien">
		<input type="text" name="aid"><br> 
		<input type="text" name="aname"><br> 
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	<br>
	<h1>Delete alien by ID</h1>
	<form action="deleteAlien">
		<input type="text" name="aid"><br> 
		<input type="submit"><br>
	</form>
</body>
</html>