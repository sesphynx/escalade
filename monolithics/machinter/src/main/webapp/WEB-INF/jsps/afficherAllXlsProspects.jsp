<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prospects</title>
</head>
<body>
<h2>Prospects</h2>
<table>
<tr>
<th>numeroM</th>
<th>addresse</th>
<th>mail</th>
<th>nom</th>
<th>prenom</th>
<th>numeroF</th>
</tr>
<c:forEach items="${prospectExcells}" var="prospectExcell">
<tr>
<td>${prospectExcell.numeroM}</td>
<td>${prospectExcell.addresse}</td>
<td>${prospectExcell.mail}</td>
<td>${prospectExcell.nom }</td>
<td>${ prospectExcell.prenom}</td>
<td>${ prospectExcell.numeroF}</td>
<td> <a href="editerProspect?prospectId=${prospect.id}">editer</a>  </td>
<td> <a href="effacerProspect?prospectId=${prospect.id}">effacer</a>  </td>
</tr>
</c:forEach>

</table>

</body>
</html>