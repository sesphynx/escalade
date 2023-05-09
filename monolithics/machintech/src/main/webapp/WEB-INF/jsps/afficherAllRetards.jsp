<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Retards</title>
</head>
<body>
	<h2>Retards</h2>
	<table>
		<tr>
			<th>conseiller</th>
			<th>arrivee</th>
			<th>entree</th>
		</tr>
		<c:forEach items="${retards}" var="retard">
			<tr>
				<td>${retard.conseiller.allonyme}</td>
				<td>${retard.arrivee}</td>
				<td>${retard.entree}</td>
				<td><a href="editerRetard?retardId=${retard.id}">editer</a></td>
				<td><a href="effacerRetard?retardId=${retard.id}">effacer</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>