<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Pandemic</title>
</head>
<body>
	<c:choose>
		<c:when test="${delete == true}">
			PANDEMIC DELETED ${pandemicID}
		</c:when>
		<c:otherwise>
			<p>No Pandemic found</p>
		</c:otherwise>
	</c:choose>
	<form class="searchButton" action="home.do">
		<button type="submit" class="btn btn-primary "
			value="Home">Home</button>
	</form>
</body>
</html>