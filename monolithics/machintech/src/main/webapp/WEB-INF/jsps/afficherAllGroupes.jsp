<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Groupes</title>
</head>
<body>
<h2>Groupes</h2>
<table>
<tr>
<th>designation</th>
<th>heure descente</th>
<th>heure siege</th>
</tr>
<c:forEach items="${groupes}" var="groupe">
<tr>
<td>${groupe.designation}</td>
<td>${groupe.heureDescente}</td>
<td>${groupe.heureSiege}</td>
<td><a href="editerGroupe?groupeId=${groupe.id}"></a></td>
<td><a href="effacerGroupe?groupeId=${groupe.id}"></a></td>
</tr>
</c:forEach>
</table>
</body>
</html>