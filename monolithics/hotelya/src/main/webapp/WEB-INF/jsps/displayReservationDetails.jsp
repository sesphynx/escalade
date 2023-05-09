<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>
Airlines:${reservation.flight.operating_airlines} <br>
Airlines:${reservation.flight.flight_number} <br>
Airlines:${reservation.flight.departure_city} <br>
Airlines:${reservation.flight.arrival_city} <br>
Airlines:${reservation.flight.date_of_departure} <br>
Airlines:${reservation.flight.estimated_departure_time} <br>

<h2>Passenger Details </h2>
First Name :${reservation.passenger.first_name } <br>
Last Name :${reservation.passenger.last_name } <br>
Email :${reservation.passenger.email} <br>
Phone :${reservation.passenger.phone} <br>

<form action="completeReservation" method="post">
Enter your number of bags you want to check in<input type="text" value="numberOfBags">
<input type="hidden" value=	"${reservation.id}">
<input type="submit" value=" Check In ">
</form>
</body>
</html>