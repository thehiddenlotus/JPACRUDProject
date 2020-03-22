<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	<h2>Add or Update Pandemic</h2>
	<form:form action="addPandemic.do" method="POST" modelAttribute="pan" >
		<form:label path="name">Name:</form:label>
		<form:input path="name" value="${pan.name }"/>
		<form:errors path="name" />
		<br />
		<form:label path="type">Type:</form:label>
		<form:input path="type" value="${pan.type }"/>
		<form:errors path="type" />
		<br />
		<form:label path="location">Outbreak Location:</form:label>
		<form:input path="location" value="${pan.location }"/>
		<form:errors path="location" />
		<br />
		<form:label path="deathToll">Death Toll:</form:label>
		<form:input path="deathToll" value="${pan.deathToll }"/>
		<form:errors path="deathToll" />
		<br />
		<form:label path="start">Start:</form:label>
		<form:input path="start" value="${pan.start }"/>
		<form:errors path="start" />
		<br />
		<form:label path="end">End:</form:label>
		<form:input path="end" value="${pan.end }"/>
		<form:errors path="end" />
		<input type="submit" value="Update" />
		<br>
	</form:form>
		<hr>
	<form class="searchButton" action="home.do">
		<button type="submit" class="btn btn-primary " value="Home">Home</button>
	</form>

</body>
</html>