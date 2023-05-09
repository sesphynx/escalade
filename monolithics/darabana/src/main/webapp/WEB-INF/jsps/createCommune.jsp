<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER COMMUNE</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>

<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>

<form:form action="saveCommune" method="post" modelAttribute="commune">
<table class="table">
 
<tr>
<td> <form:label path="nom" cssClass="label">NOM COMMUNE</form:label></td>
<td> <form:input type="text" path="nom" cssClass="input"/></td>
</tr>
<tr>
<td>		</td>
<td><form:button type="submit">SAUVER</form:button></td>
</tr>
</table>

</form:form>
	
	${msg}
<a href="displayCommunes">Voir Communes</a>
<br>
<br>
<br>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>