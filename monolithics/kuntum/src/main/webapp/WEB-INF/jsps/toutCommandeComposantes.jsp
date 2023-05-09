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
<td>${commandeComposante.commande}</td>
<td>${commandeComposante.produit}</td>
<td>${commandeComposante.price}</td>
<td>${commandeComposante.quantity}</td>

<td><a href="supprimerCommandeComposante?id=${commandeComposante.id}"><button type="submit">effacer</button></a></td>
<td><a href="ciblerCommandeComposante?id=${commandeComposante.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>


</table>
<a href="/creerCommandeComposante"> Ajouter CommandeComposante</a>

</body>
</html>