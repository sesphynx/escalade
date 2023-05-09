<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Complete Reservation</title>
</head>
<body>
<h2>Flight</h2>
Airlines:${flight.oprating_airlines}
Departure City :${flight.departure_city}
Arrival City : ${flight.arrival_city}

<form action="completeRegistration" method="post">

<h2>Passenger Details </h2>
First Name :<input type="text" value="passengerFirstName">
Last Name :<input type="text" value="passengerLastName">
Email : <input type="text" value="passengerEmail">
Phone : <input type="text" value="passengerPhone">

<h2>Credit Card Details </h2>
Name on the Card :<input type="text" value="nameOnTheCard">
Card Number :<input type="text" value="carNumber">
Expire Date : <input type="text" value="expirationDate">
Three Digit Sec Code : <input type="text" value="securityCode">


<input type="hidden" name="flightId" value=${"flight.id"}>
<input type="submit" value="Confirm">

</form>
</body>
</html>