<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BAJEENS</title>
</head>
<body>
<h2>Bajeens</h2>
<table>
<tr>
<th>COMMUNE</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
</tr>
<c:forEach  items="${bajeens}" var="bajeen">
<tr>
<td>${bajeen.commune.id}</td>
<td>${bajeen.nom}</td>
<td>${bajeen.prenom}</td>
<td>${bajeen.email}</td>
<td>${bajeen.addresse}</td>
<td><a href="deleteBajeen?id=${bajeen.id}"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateBajeen"> Add Bajeen</a>

</body>
</html>