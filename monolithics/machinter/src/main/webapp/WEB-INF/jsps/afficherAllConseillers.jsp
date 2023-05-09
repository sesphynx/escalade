<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Conseillers</title>
</head>
<body>
	<h2>Conseillers</h2>
	<table>
		<tr>
			<th>nom</th>
			<th>prenom</th>
			<th>addresse</th>
			<th>email</th>
			<th>password</th>
			<th>n° tel</th>
			<th>allonyme</th>
			<th>groupe</th>
			<th>roles</th>
		</tr>
		<tr>
			<c:forEach items="${conseillers}"  var="conseiller" >
				<td>${conseiller.nom}</td>
				<td>${conseiller.prenom}</td>
				<td>${conseiller.addresse}</td>
				<td>${conseiller.email}</td>
				<td>${conseiller.password}</td>
				<td>${conseiller.numTel}</td>
				<td>${conseiller.allonyme}</td>
				<td>${conseiller.groupe}</td>
				<td>${conseiller.roles}</td>
				<td><a href="editerConseiller?conseillerId=${conseiller.id}"></a></td>
				<td><a href="effacerConseiller?conseillerId=${conseiller.id}"></a></td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>