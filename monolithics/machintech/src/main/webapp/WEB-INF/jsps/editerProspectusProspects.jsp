<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prospects</title>
</head>
<body>
<h2>Prospects</h2>
	<table>
	<caption>idProspectus</caption>
		<tr>
			<th>addresse</th>
			<th>nom</th>
			<th>prenom</th>
			<th>mail</th>
			<th>numeroM</th>
			<th>numeroF</th>

		</tr>

		<c:forEach items="${prospects}" var ="prospect">
			<tr>
				<td>${prospect.addresse}</td>
				<td>${prospect.nom}</td>
				<td>${prospect.prenom}</td>
				<td>${prospect.mail}</td>
				<td>${prospect.numeroM}</td>
				<td>${prospect.numeroF}</td>
				<td><a href="addProspectusProspect?prospectId=${prospectus.id}"></a></td>
				<td><a href="editerProspectusProspect?prospectusId=${prospectus.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>