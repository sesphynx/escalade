<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GRADES</title>
</head>
<body>
<h2>Grade</h2>
<table>
<tr>
<th>Nom</th>
</tr>
<c:forEach  items="${grades}" var="grade">
<tr>
<td>${grade.nom}</td>
<td><a href="deleteGrade?id=${grade.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateGrade?id=${grade.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateGrade"> Ajouter Grade</a>

</body>
</html>