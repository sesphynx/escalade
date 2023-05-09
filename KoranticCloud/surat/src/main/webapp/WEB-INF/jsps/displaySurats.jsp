<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>SURATS</title>
</head>
<body>

<h2>Surats:</h2>
<table>
<tr>
<th>Surat Id</th>
<th>ORDRE</th>
<th>TOUR</th>
</tr>

<c:forEach items="${surats}" var="surat">
<tr>
<td>${surat.suratId}</td>
<td>${surat.ordre}</td>
<td>${surat.tour}</td>
<td><a href="deleteSurat?suratId=${surat.suratId}">delete</a></td>
<td><a href="showUpdate?suratId=${surat.suratId}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="insererSurat">Ajouter Surat</a>
</body>
</html>