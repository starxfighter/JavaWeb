<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Draw</title>
</head>
<body>
	<% int width = Integer.parseInt(request.getParameter("width")); %>
	<% int height = Integer.parseInt(request.getParameter("height")); %>
	<% int switchFlag = 1; %>
	<% int start = 1; %>
	
	<% for(int x = 0; x < height; x++) {%>
		<% for(int y = 0 ; y < width; y++) { %>
			<% if(switchFlag == 1) {%>
				<div class='green'><h1>A</h1></div>
				<% switchFlag = 2; %>
			<% } else if(switchFlag == 2) { %>
				<div class='red'><h1>b</h1></div>
				<% switchFlag = 1; %>
			<% } %>
		<% } %>
		<div class='stop'></div>
		<% if(start == 1) {%>
			<% switchFlag = 2; %>
			<% start = 2; %>
		<% } else if(start == 2) { %>
			<% switchFlag = 1; %>
			<% start = 1; %>
		<% } %>
	<% } %>
</body>
</html>