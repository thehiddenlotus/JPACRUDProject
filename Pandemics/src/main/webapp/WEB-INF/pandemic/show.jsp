<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Show Pandemic</title>
</head>
<body>
	<form class="searchButton" action="home.do">
		<button type="submit" class="btn btn-primary " value="Home">Home</button>
	</form>
	<hr>
	<c:choose>
		<c:when test="${! empty pandemic}">
			<h3>ID: ${pandemic.id}		${pandemic.name}</h3>
			<ul>
				<li>Type: ${pandemic.type}</li>
				<li>Death Toll: ${pandemic.deathToll}</li>
				<li>Outbreak Location: ${pandemic.location}</li>
				<li>Period: ${pandemic.start} - ${pandemic.end }</li>
			</ul>
			<br>
			<hr>
			<form action="updatePandemic.do" method="GET">
				<button type="submit" class="btn btn-primary "
					value="Update Pandemic">Update Pandemic</button>
			</form>
			<form action="deletePandemic.do" method="POST">
				<input type="hidden" name="id" value=${ pandemic.id }>
				<button type="submit" class="btn btn-primary " value="Pandemic Film">Delete
					Pandemic</button>
			</form>
		</c:when>
		<c:otherwise>
			<p>No Pandemic found</p>
		</c:otherwise>
	</c:choose>
	<hr>
</body>
</html>