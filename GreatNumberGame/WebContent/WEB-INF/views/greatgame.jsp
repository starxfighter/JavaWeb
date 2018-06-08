<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<title>Great Number Game</title>
</head>
<body>
	<div class="wrapper">
		<h1>Welcome to the Great Number Game!</h1>
		<h3>I am thinking of a number between 1 and 100</h3>
		<h3>Take a guess!</h3>
		<h1><%= (int) session.getAttribute("randNum") %></h1>
		<form class="form" action="/GreatNumberGame/GNG" method="POST">
			<input type="text" name="guess"/>
			<input type="submit" value="Submit">
		</form>
		<% if(request.getAttribute("switch") == "high") { %>
			<div class="high">
				<h4>Too High</h4>
			</div>
		<% } %>
		<% if(request.getAttribute("switch") == "low") { %>
			<div class="low">
				<h4>Too Low</h4>
			</div>
		<% } %>
		<% if(request.getAttribute("switch") == "win") { %>
			<div class="win">
				<h1><%= (int) session.getAttribute("randNum") %> was the number</h1>
				<form class="form" action="/GreatNumberGame/GNG" method="GET">
					<input type="submit" value="Play Again">
				</form>
			</div>
		<% } %>
	</div>
</body>
</html>