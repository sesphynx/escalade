<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COMMUNES</title>
</head>
<body>
<h2>Communes</h2>
<table>
<tr>
<th>Ville</th>
<th>Numero</th>
</tr>
<c:forEach  items="${communes}" var="commune">
<tr>
<td>${commune.ville}</td>
<td>${commune.numero}</td>
<td><a href="deleteCommune?id=${commune.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCommune?id=${commune.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateCommune"> Ajoute Commune</a>

</body>
</html>