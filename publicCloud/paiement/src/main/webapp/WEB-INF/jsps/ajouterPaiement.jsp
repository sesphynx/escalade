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

<title>INSERER POINT</title>
</head>
<body>

<form:form action="savePoint" method="post" modelAttribute="point">
<table>

<tr>  <td> </td>  <td>Id client:</td> <td> </td>    <td><form:input type="text" path="clientId"/></td></tr> 

<tr>  <td> </td>  <td>NOM: </td> <td> </td> <td> <form:input type="text" path="firstName"/></td></tr>

<tr>  <td> </td>  <td>PRENOM: </td>  <td> </td>  <td><form:input type="text" path="lastName"/></td></tr>

<tr>  <td> </td>  <td>EMAIL: </td>   <td> </td>  <td><form:input type="number" path="email"/></td></tr>

<tr>  <td> </td>  <td>ADDRESSE : </td> <td> </td>  <td><form:input type="number" path="addresse"/></td></tr>

<tr>  <td> </td>  <td>TELEPHONE: </td> <td> </td>  <td><form:input type="number" path="phone"/></td></tr>

<tr>  <td> </td>  <td>Id Commande:</td> <td> </td> <td><form:input type="text" path="commandeId"/></td></tr> 

<tr>  <td> </td>  <td>NAME: </td>  <td> </td> <td> <form:input type="text" path="name"/></td></tr>

<tr>  <td> </td>  <td>DESCRIPTION: </td> <td> </td>  <td><form:input type="text" path="description"/></td></tr>

<tr>  <td> </td>  <td>QUANTITE: </td> <td> </td>  <td><form:input type="number" path="quantite"/></td></tr>

<tr>  <td> </td>  <td>PRICE : </td> <td> </td>  <td><form:input type="number" path="price"/></td></tr>

<tr>  <td> </td>  <td>TOTAL: </td> <td> </td> <td><form:input type="number" path="prixTotal"/></td></tr>

<tr>  <td> </td>  <td>ENVIRONMENT</td>  <td> </td> <td><form:input type="text" path="env"/></td></tr>

<tr><td></td> <td>  <td> </td>  <td> </td> <input type="submit" value="save"/></td></tr>

</table>
</form:form>
${msg}

<a href="displayPoints">AFFICHER LES POINTS</a>

</body>
</html>