<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VILLES</title>
</head>
<body>
<h2>Villes</h2>
<table>
<tr>
<th>Region</th>
<th>Nom</th>
</tr>
<c:forEach  items="${villes}" var="ville">
<tr>
<td>${region}</td>
<td>${ville.nom}</td>
<td><a href="deleteVille?id=${ville.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateVille?id=${ville.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateVille"> Ajoute Ville</a>

</body>
</html>