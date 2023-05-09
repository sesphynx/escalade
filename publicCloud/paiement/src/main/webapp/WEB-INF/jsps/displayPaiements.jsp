<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PAIEMENTS</title>
</head>
<body>

<h2>Paiements:</h2>
<table>
<tr>
<th>Client Id</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
<th>TELEPHONE</th>
<th>Commande Id</th>
<th>Name</th>
<th>Description</th>
<th>Quantite</th>
<th>Prix</th>
<th>Total</th>
<th>Environnement</th>

</tr>

<c:forEach items="${paiements}" var="paiement">
<tr>
<td>${paiement.clientId}</td>
<td>${paiement.nom}</td>
<td>${paiement.prenom}</td>
<td>${paiement.email}</td>
<td>${paiement.addresse}</td>
<td>${paiement.phone}</td>
<td>${paiement.commandeId}</td>
<td>${paiement.name}</td>
<td>${paiement.description}</td>
<td>${paiement.quantite}</td>
<td>${paiement.price}</td>
<td>${paiement.prixTotal}</td>
<td>${paiement.env}</td>

<td><a href="deletePaiement?id=${paiement.paiementId}">SUPPRIMER</a></td>
<td><a href="showUpdate?id=${paiement.paiementId}">EDITER</a></td>
</tr>
</c:forEach>
</table>
<a href="creerPaiement">AJOUTER PAIEMENT</a>
</body>
</html>