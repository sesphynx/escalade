<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Codifier Prospectus</title>
</head>
<body>
<form action="enregistrerProspectus" method="post">
<pre>
Campagne:<input type="text" name="campagne" />
Conseiller:<input type="text" name="conseiller"/>
Prospects:<input type="button"  value="editerProspectusProspect?prospectusId=${prospectus.id}">
<table>
<tr>
<th>nom</th>
<th>prenom</th>
<th>addresse</th>
<th>mail</th>
<th>Numero Mobile</th>
<th>Numero Fixe</th>
</tr>
<c:forEach items="${prospects}" var="prospect">
<tr>
<td>${prospect.nom}</td>
<td>${prospect.prenom}</td>
<td>${prospect.addresse}</td>
<td>${prospect.mail}</td>
<td>${prospect.numeroM}</td>
<td>${prospect.numeroF}</td>
<td><button><a href="creerCodification?prospectId">Codifier</a></button></td>
<td> <button><a href="creerRappel?prospectId">Rappel</a></button></td>
<td><button><a href="creerVente?prospectId">Vente</a></button></td>
</tr>
</c:forEach>
</table>
<input type="submit" value="submit">
</pre>
</form>
${msg}
<a href="afficherAllProspectuss">Prospectus Enregistrés</a>
</body>
</html>