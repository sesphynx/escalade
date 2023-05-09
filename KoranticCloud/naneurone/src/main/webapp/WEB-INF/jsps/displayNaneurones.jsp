<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NANEURONES</title>
</head>
<body>

<h2>Naneurones:</h2>
<table>
<tr>
<th>Naneurone Id</th>
<th>Verset Id</th>
<th>SuratId</th>
<th>Ordre</th>
<th>Tour</th>
<th>Libelle</th>
<th>Extraction</th>
<th>Valeur</th>
</tr>

<c:forEach items="${naneurones}" var="naneurone">
<tr>
<td>${naneurone.naneuroneId}</td>
<td>${naneurone.versetId}</td>
<td>${naneurone.suratId}</td>
<td>${naneurone.ordre}</td>
<td>${naneurone.tour}</td>
<td>${naneurone.libelle}</td>
<td>${naneurone.extraction}</td>
<td>${naneurone.valeur}</td>
<td><a href="deleteNaneurone?naneuroneId=${naneurone.naneuroneId}">delete</a></td>
<td><a href="showUpdate?naneuroneId=${naneurone.naneuroneId}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Naneurone</a>
</body>
</html>