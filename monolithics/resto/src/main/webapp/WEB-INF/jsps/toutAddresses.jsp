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
<title>ADDRESSES</title>
</head>
<body>
<h2>Addresses</h2>
<table>
<tr>
<th>Addresse Ln1</th>
<th>Addresse Ln2</th>
<th>Country/Pays</th>
<th>City/Ville</th>
<th>State/Etat</th>
<th>Code Zip</th>
</tr>
<c:forEach  items="${addresses}" var="addresse">
<tr>
<td>${addresse.addressLine1}</td>
<td>${addresse.addressLine2}</td>
<td>${addresse.country}</td>
<td>${addresse.city}</td>
<td>${addresse.state}</td>
<td>${addresse.zipCode}</td>

<td><a href="deleteAddresse?id=${addresse.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateAddresse?id=${addresse.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/creerAddresse"> Ajoute Addresse</a>

</body>
</html>