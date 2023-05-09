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
<title>COMMANDES</title>
</head>
<body>
<h2>Commandes</h2>
<table class="table">
<tr>
<th>Client</th>
<th>Order Number</th>
<th>Creer Le</th>
<th>Addresse Livraison</th>
<th>Addresse Facturation</th>
<th>Payment</th>
<th>Etat</th>
<th>Items<>

</tr>
<c:forEach  items="${commandes}" var="commande">
<tr>
<td>${commande.client}</td>
<td>${commande.orderNumber}</td>
<td>${commande.createdOn}</td>
<td>${commande.addresseFacturation}</td>
<td>${commande.addresseLivraison}</td>
<td>${commande.addresseLivraison}</td>
<td>${commande.Payment}</td>
<td>${commande.etat}</td>
<td><a href="/afficherCommandeCommandeComposante">Composantes</a></td>

<td><a href="supprimerCommande?id=${commande.id}"><button type="submit">effacer</button></a></td>
<td><a href="ciblerCommande?id=${commande.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>


</table>
<a href="/creerCommande"> Ajouter Commande</a>

</body>
</html>