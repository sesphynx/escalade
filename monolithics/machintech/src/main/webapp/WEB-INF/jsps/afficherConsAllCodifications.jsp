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
<h2>Conseiller Codifications </h2>
Allonyme:${conseiller.allonyme }
Email : ${conseiller.email }

<table>
		<tr>
			<th>date codification</th>
			<th>n° prospect</th>
			<th>typeCodif</th>
		</tr>

		<c:forEach items="${codifications }" var="codification ">
			<tr>
				<td>${codification.dateCodif}</td>
				<td>${codification.prospect}</td>
				<td>${codification.typeCodif}</td>
				<td><a href="editerCodification?codificationId=${codification.id}">editer</a></td>
				<td><a href="effacerCodification?codificationId=${codification.id}">effacer</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>