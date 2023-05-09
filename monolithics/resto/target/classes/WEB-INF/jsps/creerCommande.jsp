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
<title>Edite Commande</title>
<%@include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@include file="/WEB-INF/jsps/fragments/menuBar.html" %>

<form:form action="sauvegarderCommande" method="post" modelAttribute="commande">

<table class="table table-dark" >
<th>Client</th>
<th>Order Number</th>
<th>Creer Le</th>
<th>Addresse Livraison</th>
<th>Addresse Facturation</th>
<th>Payment</th>
<th>Etat</th>
<th>Items<>

<tr>
<td>Client</td> <td> <form:input type="client" path="client"  /></td>
</tr>

<tr>
<td>Order Number</td><td> <form:input type="text" path="orderNumber" /></td>
</tr>
<tr>
<td>Cree Le</td><td> <form:input type="text" path="createdOn" /></td>
</tr>
<tr>
<td>ADDRESSE LIVRAISON</td><td> <form:input type="addresse" path="addresseLivraison"  "/></td>
</tr>
<tr>
<td>ADDRESSE FACTURATION</td><td> <form:input type="addresse" path="addresseFacturation" /></td>
</tr>
<tr>
<td>Payment</td> <td> <form:input type="payment" path="payment"  /></td>
</tr>

<tr>
<td>Etat</td><td> <form:input type="text" path="orderNumber" /></td>
</tr>
<tr>
<td>Details Commande </td><td> <form:select><option></form:select></td>
</tr>	
	<tr>
	<td><input type="text" value="save"></td>
	</tr>
</table>

<h2>CommandeComposantes</h2>
<table class="table">

<tr>
<th>Commande</th>
<th>Produit</th>
<th>Prix</th>
<th>Quantité</th>
</tr>
<c:forEach  items="${commandeComposantes}" var="commandeComposante">
<tr>
<td>${commandeComposante.commande.id}</td>
<td>${commandeComposante.produit}</td>
<td>${commandeComposante.price}</td>
<td>${commandeComposante.quantity}</td>

<td><a href="supprimerCommandeComposante?id=${commandeComposante.id}"><button type="submit">effacer</button></a></td>
<td><a href="ciblerCommandeComposante?id=${commandeComposante.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>


</table>
	
</form:form>
${msg}
<a href="toutCommandes">Voir les Commandes du Systéme</a>

<%@include file="/WEB-INF/jsps/fragments/footerr.html" %>
</body>
</html>