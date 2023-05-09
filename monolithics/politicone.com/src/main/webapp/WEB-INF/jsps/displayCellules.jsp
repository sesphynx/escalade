<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CELLULES</title>
</head>
<body>
<h2>Cellules</h2>
<table>
<tr>
<th>Quartier</th>
<th>Numero</th>
</tr>
<c:forEach  items="${cellules}" var="cellule">
<tr>
<td>${cellule.quartier}</td>
<td>${cellule.numero}</td>
<td><a href="deleteCellule?id=${cellule.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCellule?id=${cellule.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateCellule"> Ajoute Cellule</a>

</body>
</html>