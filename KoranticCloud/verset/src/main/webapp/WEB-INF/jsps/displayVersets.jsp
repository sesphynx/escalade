<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PRODUITS</title>
</head>
<body>

<h2>Versets:</h2>
<table>
<tr>
<th>Verset Id</th>
<th>SuratId</th>
<th>Ordre</th>
<th>Tour</th>
<th>Libelle</th>
<th>Extraction</th>
</tr>

<c:forEach items="${versets}" var="verset">
<tr>
<td>${verset.versetId}</td>
<td>${verset.suratId}</td>
<td>${verset.ordre}</td>
<td>${verset.tour}</td>
<td>${verset.libelle}</td>
<td>${verset.extraction}</td>
<td><a href="deleteVerset?versetId=${verset.versetId}">delete</a></td>
<td><a href="showUpdate?versetId=${verset.versetId}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Verset</a>
</body>
</html>