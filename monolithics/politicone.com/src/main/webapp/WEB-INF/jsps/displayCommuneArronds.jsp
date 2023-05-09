<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COMMUNES D' ARRONDISSEMNT</title>
</head>
<body>
<h2>Communes d' Arrondissement</h2>
<table>
<tr>
<th>Departement</th>
<th>Nom</th>
</tr>
<c:forEach  items="${communeArronds}" var="communeArrond">
<tr>
<td>${communeArrond.departement}</td>
<td>${communeArrond.nom}</td>
<td><a href="deleteCommuneArrond?id=${communeArrond.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCommuneArrond?id=${communeArrond.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateCommuneArrond"> Ajoute CommuneArrond</a>

</body>
</html>