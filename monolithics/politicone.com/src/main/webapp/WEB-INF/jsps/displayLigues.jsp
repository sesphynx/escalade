<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LIGUES</title>
</head>
<body>
<h2>Ligues</h2>
<table>
<tr>
<th>Pays</th>
<th>Nom</th>
</tr>
<c:forEach  items="${ligues}" var="ligue">
<tr>
<td>${ligue.pays}</td>
<td>${ligue.nom}</td>
<td><a href="deleteLigue?id=${ligue.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateLigue?id=${ligue.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateLigue"> Ajoute Ligue</a>

</body>
</html>