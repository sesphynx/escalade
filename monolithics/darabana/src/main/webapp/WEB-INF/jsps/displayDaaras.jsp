<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Daaras </title>
</head>
<body>
<h2>Daaras Inscrits</h2>
<table>
<tr>
<th>Localisation</th>
<th>Nom</th>
<th>Nbre Pièces</th>
<th>Nbre Enfants</th>
<th>Couverture Medicale</th>
</tr>


<c:forEach  items="${daaras}" var="daara">
<tr>
<td>${daara.localisation.region}</td>
<td>${daara.nom}</td>
<td>${daara.nbrePieces}</td>
<td>${daara.nbreEnfants}</td>
<td>${daara.couvertureMedicale}</td>
<td><a href="deleteDaara?id=${daara.id}"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateDaara"> Add Daara</a>
</html>