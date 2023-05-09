<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOCALISATIONS</title>
</head>
<body>
<h2>Localisations</h2>
<table>
<tr>
<th>Region</th>
<th>Commune</th>
<th>Quartier</th>
<th>Addresse</th>
</tr>
<c:forEach  items="${localisations}" var="localisation">
<tr>
<td>${localisation.region}</td>
<td>${localisation.commune.nom}</td>
<td>${localisation.quartier}</td>
<td>${localisation.addresse}</td>
<td><a href="deleteLocalisation?id=${localisation.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateLocalisation?id=${localisation.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateLocalisation"> Add Localisation</a>

</body>
</html>