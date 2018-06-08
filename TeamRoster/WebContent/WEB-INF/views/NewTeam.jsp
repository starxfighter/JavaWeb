<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Team</title>
</head>
<body>
	<h1>Create a new team</h1>
	<form class='form' action="/TeamRoster/Team" method="POST">
		Team Name: <input type="text" name="teamname"/>
		<input type="submit" value="Create">	
	</form>
</body>
</html>