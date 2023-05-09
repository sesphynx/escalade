<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>

<title>Create Localisation</title>

</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<form:form action="saveLocalisation" modelAttribute="localisation" method="post">
<table>
<tr>
<td><form:label path="region" cssClass="label">Region</form:label></td>
<td><form:input type="text" path="region" cssClass="input"/></td>
</tr>

<tr>
<td><form:label path="commune">Commune</form:label></td>
<td>
<form:select  items="${communes}"  path="commune">
<form:option value="${commune.id}">"${commune.nom}"</form:option>
</form:select>
</td>
</tr>


<tr>
<td><form:label path="quartier" cssClass="label">Quartier</form:label></td>
<td><form:input type="text" path="quartier" cssClass="input"/></td>
</tr>


<tr>
<td><form:label path="addresse" cssClass="label">Addresse</form:label></td>
<td><form:input type="text" path="addresse" cssClass="input"/></td>
</tr>

<tr>
<td>
<form:button type="submit" value="save">SAUVER</form:button>
</td>
</tr>
	
</table>

</form:form>
${msg}
<a href="displayLocalisations">View All Localisations</a>
<div id="footer">
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</div>

</body>
</html>