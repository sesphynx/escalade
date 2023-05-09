<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PRODUITS</title>
</head>
<body>
<h2>Produits</h2>
<table>
<tr>
<th rowspan="3">Image</th>
<th>Category</th>
<th>Name</th>
<th>Price</th>
<th>Description</th>
<th>sku</th>
<th>Disabled</th>
<th>Producteur</th>
</tr>
<c:forEach  items="${produits}" var="produit">
<tr>
<td>${produit.addressLine1}</td>
<td>${produit.addressLine2}</td>
<td>${produit.country}</td>
<td>${produit.city}</td>
<td>${produit.state}</td>
<td>${produit.zipCode}</td>

<td><a href="deleteProduit?id=${produit.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateProduit?id=${produit.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/creerProduit"> Ajoute Produit</a>

</body>
</html><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>