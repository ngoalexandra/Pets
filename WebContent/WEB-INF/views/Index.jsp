<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<div class = "container">

<div class = "dog">
<h3>Create A Dog Here:</h3>
<form action = "Pets/dog" method = "post">
Name:
<input type = "text" name = "name"> <br>
Breed:
<input type = "text" name = "breed"> <br>
Weight: 
<input type = "text" name = "weight"><br>

<input type = "submit" value = "Submit">
</form>
</div>

<div class = "cat">
<h3>Create A Cat Here:</h3>
<form action = "Pets/cat" method = "post">
Name:
<input type = "text" name = "name"> <br>
Breed:
<input type = "text" name = "breed"> <br>
Weight: 
<input type = "text" name = "weight"><br>

<input type = "submit" value = "Submit">
</form>

</div>


</div>
	
</body>
</html>