<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<div class="wrapper">
		<div>
			<form class="form" action="/ButtonCicker/Button">
				<input type="submit" value="Click Me">
			</form>
		</div>
		<div>
			<h1>You clicked the button <%= (int) session.getAttribute("counter") %> times</h1>
		</div>
	</div>
	
</body>
</html>