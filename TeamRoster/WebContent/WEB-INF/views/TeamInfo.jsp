<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team</title>
</head>
<body>
	<h1><c:out value="${team.teamName}"/></h1>
	<a href="/TeamRoster/Player?teamid=${teamidx}"><button type="button">New Player</button></a>
	<a href="/TeamRoster/Home"><button type="button">Home</button></a>
	<div class="table">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Actions</th>
			</tr>
				<c:forEach var='player' items="${players}" varStatus="idx">
				<tr>
					<td><c:out value="${player.firstName}"/></td>
					<td><c:out value="${player.lastName}"/></td>
					<td><c:out value="${player.age}"/></td>
					<td>
						<a href="/TeamRoster/deletePlayer?teamid=${teamidx}&playerid=${idx.index}"><button type="button">Delete</button></a>
					</td>
				</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>
