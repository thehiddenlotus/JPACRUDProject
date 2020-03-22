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
<title>Update Pandemic</title>
</head>
<body>
	<form class="searchButton" action="home.do">
		<button type="submit" class="btn btn-primary " value="Home">Home</button>
	</form>
	<hr>
	<c:choose>
		<c:when test="${pan != null}">
			PANDEMIC ${pan.id} UPDATED 
			<br>
			${pan}
			<form action="getPandemic.do" method="GET">
				<input type="hidden" name="id" value=${ pandemic.id }>
				<button type="submit" class="btn btn-primary " value="Show Pandemic">Show Details</button>
			</form>
		</c:when>
		<c:otherwise>
			<p>There may have been an error</p>
		</c:otherwise>
	</c:choose>
	<hr>
</body>
</html>