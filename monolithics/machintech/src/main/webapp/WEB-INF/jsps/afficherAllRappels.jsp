<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rappels</title>
</head>
<body>
	<h2>Rappels</h2>
	<table>
		<tr>
			<th>nom conseiller</th>
			<th>date codification</th>
			<th>n° prospect</th>
			<th>typeCodif</th>
			<th>date rappel</th>
			<th>etat</th>
			<th>prospect</th>
		</tr>
		<c:forEach items="${rappels}" var="rappel">
			<tr>
				<td>${rappel.conseiller.allonyme}</td>
				<td>${codification.dateCodif}</td>
				<td>${codification.prospect}</td>
				<td>rappel</td>
				<td>${rappel.dateRappel}</td>
				<td>${rappel.etat}</td>
				<td>${rappel.prospect}</td>
				<td><a href="editerRappel?rappelId=${rappel.id}">editer</a></td>
				<td><a href="effacerRappel?rappelId=${rappel.id}">effacer</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>