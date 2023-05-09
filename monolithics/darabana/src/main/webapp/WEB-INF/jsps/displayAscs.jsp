<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOCALISATIONS</title>
</head>
<body>
<h2>ASCs</h2>
<table>
<tr>

<th>Commune</th>
<th>NOM</th>
<th>TYPE PARRAINAGE</th>
</tr>
<c:forEach  items="${ascs}" var="asc">
<tr>
<td>${asc.commune.nom}</td>
<td>${asc.nom}</td>
<td>${asc.typeParrainage}</td>
<td><a href="deleteParrainage?id=${asc.id }"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateLocalisation"> Add Localisation</a>

</body>
</html>