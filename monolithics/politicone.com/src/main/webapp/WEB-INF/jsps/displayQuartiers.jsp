<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QUARTIERS</title>
</head>
<body>
<h2>Quartiers</h2>
<table>
<tr>
<th>Commune</th>
<th>Nom</th>
</tr>
<c:forEach  items="${quartiers}" var="quartier">
<tr>
<td>${quartier.commune.nom}</td>
<td>${quartier.nom}</td>
<td><a href="deleteQuartier?id=${quartier.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateQuartier?id=${quartier.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateQuartier"> Ajoute Quartier</a>

</body>
</html>