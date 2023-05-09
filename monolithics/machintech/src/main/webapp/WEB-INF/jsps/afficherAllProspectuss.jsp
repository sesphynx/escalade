<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Prospectus</h2>
	<table>
		<tr>
			<th>campagne</th>
			<th>conseiller</th>
		</tr>
		<c:forEach items="${prospectuss}" var="prospectus">
			<tr>
				<td>${campagne.operateur}+""+${campagne.nature}</td>
				<td>${conseiller.allonyme}</td>
				<td><a
					href="afficherProspectusProspect?prospectusId=${prospectus.id}"></a>Prospects</td>
				<td><a href="editerProspectus?prospectusId=${prospectus.id}"></a>Editer</td>
				<td><a href="effacerProspectus?prospectusId=${prospectus.id}"></a>Supprimer</td>
				<td></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>