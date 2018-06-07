<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Make an animal</title>
</head>
<body>
	<div class='wrapper'>
		<div class='dog'>
			<form class='form' action="/Pets/dog">
				<h3>Name : <input type="text" name='name'></h3>
				<h3>Breed : <input type="text" name="breed"></h3>
				<h3>Weight(lb.): <input type="number" name="weight"></h3>
				<input type="submit" value="Submit">	
			</form>	
		</div>
		<div class='cat'>
			<form class='form' action="/Pets/cat">
				<h3>Name : <input type="text" name='name'></h3>
				<h3>Breed : <input type="text" name="breed"></h3>
				<h3>Weight: <input type="number" name="weight"></h3>
				<input type="submit" value="Submit">	
			</form>	
		</div>
	</div>
</body>
</html>