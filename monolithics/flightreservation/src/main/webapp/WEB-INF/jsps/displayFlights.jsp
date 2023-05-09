<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html >
<html lang="en" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Flights</title>
</head>
<body>
	<h2>Flights</h2>
	
	<table>
		<tr>
			<th>Operating Airlines</th>
			<th>Departure City</th>
			<th>Arrival City</th>
		</tr>

		<c:forEach items="${flights}" var ="flight">
			<tr>
				<td>${flight.operating_airlines}</td>
				<td>${flight.departure_city}</td>
				<td>${flight.arrival_city}</td>
				<td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>
	
</body>
</html>