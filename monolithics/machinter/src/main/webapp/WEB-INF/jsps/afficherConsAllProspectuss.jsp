<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prospectus de Conseiller</title>
</head>
<body>

<h2>Conseiller Prospectus </h2>
Allonyme:${conseiller.allonyme }
Email : ${conseiller.email }

<table>
		<tr>
			<th>campagne</th>
		</tr>
		<c:forEach items="${prospectuss}" var="prospectus">
			<tr>
				<td>${campagne.operateur}+""+${campagne.nature}</td>
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