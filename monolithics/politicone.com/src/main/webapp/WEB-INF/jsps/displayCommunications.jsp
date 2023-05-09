<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COMMUNIQUATIONS</title>
</head>
<body>
<h2>Communications</h2>
<table>
<tr>
<th>Entité</th>
<th>Descriptif</th>
<th>Libellé</th>
</tr>
<c:forEach  items="${communications}" var="communication">
<tr>
<td>${communication.entite}</td>
<td>${communication.descriptif}</td>
<td>${communication.libelle}</td>
<td><a href="deleteCommunication?id=${communication.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCommunication?id=${communication.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateCommunication"> Ajoute Communication</a>

</body>
</html>