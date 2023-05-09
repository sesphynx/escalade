<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>


<h2>Users</h2>
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
			<c:forEach items="${users}" var="user">
				<td>${user.nom}</td>
				<td>${user.prenom}</td>
				<td>${user.addresse}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>
				<td>${user.numTel}</td>
				<td><a href="afficherUserRoles?userId=${user.id}">Roles</a></td>
				<td><a href="editerUser?userId=${user.id}">editer</a></td>
				<td><a href="effacerUser?userId=${user.id}">effacer</a></td>
			</c:forEach>
		</tr>
	</table>


</body>
</html>