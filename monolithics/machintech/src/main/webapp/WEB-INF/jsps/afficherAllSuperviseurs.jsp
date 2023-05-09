<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Absences</title>
</head>
<body>

<h2>Superviseurs</h2>
	<table>
		<tr>
			<th>nom</th>
			<th>prenom</th>
			<th>addresse</th>
			<th>email</th>
			<th>password</th>
			<th>n° tel</th>
			<th>Role</th>
		</tr>
		<tr>
			<c:forEach items="${superviseurs}" var="superviseur">
				<td>${superviseur.nom}</td>
				<td>${superviseur.prenom}</td>
				<td>${superviseur.addresse}</td>
				<td>${superviseur.email}</td>
				<td>${superviseur.password}</td>
				<td>${superviseur.numTel}</td>
				<td><a href="afficherUserRoles?superviseurId=${superviseur.id}">Roles</a></td>
				<td><a href="editerUser?superviseurId=${superviseur.id}">editer</a></td>
				<td><a href="effacerUser?superviseurId=${superviseur.id}">effacer</a></td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>