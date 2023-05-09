<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COMMISSIONS</title>
</head>
<body>
<h2>Commissions</h2>
<table>
<tr>
<th>Region</th>
<th>Numero</th>
</tr>
<c:forEach  items="${commissions}" var="commission">
<tr>
<td>${commission.region}</td>
<td>${commission.numero}</td>
<td><a href="deleteCommission?id=${commission.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCommission?id=${commission.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateCommission"> Ajoute Commission</a>

</body>
</html>