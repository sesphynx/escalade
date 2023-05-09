<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER ADDRESSE</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
	
</head>
<body>
<jsp:include page="/WEB-INF/jsps/fragments/menuBar.html"></jsp:include>

<form:form action="sauvegarderAddresse" method="post" modelAttribute="addresse">
<pre>

<h2>Addresses</h2>
<table class="table table-dark">
<tr>
<td>Addresse Ln1</td>
<td><form:input type="text" path="addressLine1"/></td>
</tr>
<tr>
<td>Addresse Ln2</td>
<td><form:input type="text" path="addressLine2"/></td>
</tr>
<tr>
<td>Country/Pays</td>
<td><form:input type="text" path="country"/></td>
</tr>

<tr>
<td>City/Ville</td>
<td><form:input type="text" path="city"/></td>

</tr>

<tr>
<td>State/Etat</td>
<td><form:input type="text" path="state"/></td>
</tr>

<tr>
<td>Code Zip</td>
<td><form:input type="text" path="zipCode"/></td>
</tr>
</tr>
</table>

<button type="submit">SAUVER</button>

</pre>
</form:form>
	
	${msg}
<a href="toutAddresses">Voir ADDRESSES</a>
</body>
</html>