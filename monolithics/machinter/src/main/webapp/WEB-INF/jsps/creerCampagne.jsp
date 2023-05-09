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
<title>Créer CAMPAGNE</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<form:form action="enregistrerCampagne" method="post" modelAttribute="campagne">
<table>
<tr>
<td>Date Debut</td><td> </td><td><form:input type="date" path="dateDebut" /></td></tr>
<tr>
<td>Date Fin </td><td> </td> <td><form:input type="date" path="dateFin"/></td>
</tr>
<tr><td> Nature </td> <td> </td> <td><form:input type="text" path="nature"/></td>
</tr>
<tr><td>Operateur</td> <td> </td> <td><form:select path="operateur">
    <form:option value="-" label="--Choisir Operateur--"/>
    <form:options items="${allOperateurs}" itemValue="id" itemLabel="name"/>
</form:select></td>
</tr>
<tr>
<td> </td><td><input type="submit" name="submit" value="ajouter"/></td>
</tr>

</form:form>
${msg}
</table>
<a href="afficherAllCampagnes">Operateurs Enregistrés</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>