<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Roles</title>
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