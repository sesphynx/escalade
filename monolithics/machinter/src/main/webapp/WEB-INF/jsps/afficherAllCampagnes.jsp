<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flights</title>
</head>
<body>
	<h2>Campagne</h2>
	<table>
		<tr>
			<th>Operateur</th>
			<th>Nature</th>
			<th>Date Debut</th>
		</tr>

		<c:forEach items="${campagnes}" var ="campagne">
			<tr>
				<td>${campagne.operateur}</td>
				<td>${campagne.nature}</td>
				<td>${campagne.dateDebut}</td>
				<td><a href="editerCampagne?campagneId=${campagne.id}">Select</a></td>
				<td><a href="effacerCampagne?campagneId=${campagne.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>