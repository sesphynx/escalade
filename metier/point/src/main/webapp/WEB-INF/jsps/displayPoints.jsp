<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>POINTS</title>
</head>
<body>

<h2>Points:</h2>
<table>
<tr>
<th>Point Id</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
<th>TELEPHONE</th>
</tr>

<c:forEach items="${points}" var="point">
<tr>
<td>${point.pointId}</td>
<td>${point.addresse}</td>
<td>${point.phone}</td>
<td><a href="deletePoint?id=${point.pointId}">SUPPRIMER</a></td>
<td><a href="showUpdate?id=${point.pointId}">EDITER</a></td>
</tr>
</c:forEach>
</table>
<a href="creerPoint">AJOUTER POINT</a>
</body>
</html>