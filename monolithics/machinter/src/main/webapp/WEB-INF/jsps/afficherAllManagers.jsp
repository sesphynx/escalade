<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Managers</title>
</head>
<body>

<h2>Managers</h2>
	<table>
		<tr>
			<th>nom</th>
			<th>prenom</th>
			<th>addresse</th>
			<th>email</th>
			<th>password</th>
			<th>n° tel</th>
		</tr>
		<tr>
			<c:forEach items="${managers}" var="manager">
				<td>${manager.nom}</td>
				<td>${manager.prenom}</td>
				<td>${manager.addresse}</td>
				<td>${manager.email}</td>
				<td>${manager.password}</td>
				<td>${manager.numTel}</td>
				<td><a href="editerManager?managerId=${manager.id}"></a></td>
				<td><a href="effacerManager?managerId=${manager.id}"></a></td>
			</c:forEach>
		</tr>
	</table>

</body>
</html>