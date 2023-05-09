<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Absences</title>
</head>
<body>
	<h2>Absences</h2>
	<table>
		<tr>
			<th>nom conseiller</th>
			<th>date absence</th>
		</tr>
		<c:forEach items="${absences}" value="absence">
			<tr>
				<td>${absence.conseiller.conseillerId}</td>
				<td>${absence.dateAbsence}</td>
				<td><a href="editerAbsence?absenceId=${absence.id }">Editer</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>