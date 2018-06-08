<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Player</title>
</head>
<body>
	<h1>Add a player to team <c:out value="${team.teamName}"/></h1>
	<form class='form' action="/TeamRoster/Player?teamid=${teamidx}" method="POST">
		First Name: <input type="text" name="firstname"/>
		Last Name: <input type="text" name="lastname"/>
		Age: <input type="number" name="pAge"/>
		<input type="submit" value="Add">
	</form>
</body>
</html>