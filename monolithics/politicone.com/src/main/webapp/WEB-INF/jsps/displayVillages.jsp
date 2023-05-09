<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEPARTEMENTS</title>
</head>
<body>
<h2>Villages</h2>
<table>
<tr>
<th>Commune Arrondissement</th>
<th>Nom</th>
</tr>
<c:forEach  items="${villages}" var="village">
<tr>
<td>${village.communeArrond}</td>
<td>${village.nom}</td>
<td><a href="deleteVillage?id=${village.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateVillage?id=${village.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateVillage"> Ajoute Village</a>

</body>
</html>