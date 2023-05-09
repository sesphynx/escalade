<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Role Utilisateur</title>
</head>
<body>
<h2>Roles</h2>
	
	<table>
		<tr>
			<th>name</th>
		</tr>
		<c:forEach items="${roles}" var="role">
			<tr>
				<td>${role.name}</td>
				<td><a href="editerRole?roleId=${role.id}">editer</a></td>
				<td><a href="effacerRole?roleId=${role.id}">effacer</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>