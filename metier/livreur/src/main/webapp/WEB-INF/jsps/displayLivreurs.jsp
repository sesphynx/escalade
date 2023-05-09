<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LIVREURS</title>
</head>
<body>

<h2>Livreurs:</h2>
<table>
<tr>
<th>Livreur Id</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
<th>TELEPHONE</th>
</tr>

<c:forEach items="${livreurs}" var="livreur">
<tr>
<td>${livreur.livreurId}</td>
<td>${livreur.nom}</td>
<td>${livreur.prenom}</td>
<td>${livreur.email}</td>
<td>${livreur.addresse}</td>
<td>${livreur.phone}</td>
<td><a href="deleteLivreur?id=${livreur.livreurId}">SUPPRIMER</a></td>
<td><a href="showUpdate?id=${livreur.livreurId}">EDITER</a></td>
</tr>
</c:forEach>
</table>
<a href="creerLivreur">AJOUTER LIVREUR</a>
</body>
</html>