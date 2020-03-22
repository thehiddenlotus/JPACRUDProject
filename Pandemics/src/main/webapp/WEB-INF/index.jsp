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
<title>Historic Pandemics</title>
</head>
<body>
	<h1>Historic Pandemics</h1>
	<form action="getPandemic.do" method="GET">
		ID: <input type="text" name="pid" /> <input type="submit"
			value="Search Pandemic" />
	</form>
	<br>
	<hr>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Type</th>
				<th>Death Toll</th>
				<th>Outbreak Location</th>
				<th>Period</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pan" items="${pandemics}">
				<tr>
					<td>${pan.id}</td>
					<td><a href="getPandemic.do?pid=${pan.id}">${pan.name}</a></td>
					<td>${pan.type}</td>
					<td>${pan.deathToll}</td>
					<td>${pan.location}</td>
					<td>${pan.start} - ${pan.end}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<div>
		<form class="searchButton" action="addPandemic.do">
			<button type="submit" class="btn btn-primary " value="Add New Pandemic">Add
				New Pandemic</button>
		</form>
	</div>
</body>
</html>