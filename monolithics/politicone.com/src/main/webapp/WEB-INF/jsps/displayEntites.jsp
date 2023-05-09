<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ENTITES</title>
</head>
<body>
<h2>Entités</h2>
<table>
<tr>
<th>Nom</th>
<th>Envergure</th>
</tr>
<c:forEach  items="${entites}" var="entite">
<tr>
<td>${entite.nom}</td>
<td>${entite.envergure}</td>
<td><a href="deleteEntite?id=${entite.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateEntite?id=${entite.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateEntite"> Ajouter Entité</a>

</body>
</html>