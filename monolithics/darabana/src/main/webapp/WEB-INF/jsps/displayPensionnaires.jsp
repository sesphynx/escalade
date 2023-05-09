<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PENSIONNAIRES</title>
</head>
<body>
<h2>Pensionnaires</h2>
<table>
<tr>
<th>Daara</th>
<th>NOM</th>
<th>PRENOM</th>
</tr>
<c:forEach  items="${pensionnaires}" var="pensionnaire">
<tr>
<td>${pensionnaire.daara.id}</td>
<td>${pensionnaire.nom}</td>
<td>${pensionnaire.prenom}</td>
<td><a href="deletePansionnaire?id=$pensionnaire.id"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreatePensionnaire"> Ajouter Pensionnaire</a>

</body>
</html>