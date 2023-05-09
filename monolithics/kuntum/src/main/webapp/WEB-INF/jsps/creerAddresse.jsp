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

<%@  include file="/WEB-INF/jsps/fragments/header.html" %>
	
</head>
<body>
<%@  include file="/WEB-INF/jsps/fragments/menuBar.html" %>

<form:form action="sauvegarderAddresse" method="post" modelAttribute="addresse">
<pre>

<h2>Addresses</h2>
<table class="table">
<tr>
<td>Addresse Ln1</td><td><form:input type="text" path="addressLine1"/></td>
</tr>
<tr>
<td>Addresse Ln2</td><td><form:input type="text" path="addressLine2"/></td>
</tr>
<tr>
<td>Country/Pays</td><td><form:input type="text" path="country"/></td>
</tr>

<tr>
<td>City/Ville</td><td><form:input type="text" path="city"/></td>

</tr>

<tr>
<td>State/Etat</td><td><form:input type="text" path="state"/></td>
</tr>

<tr>
<td>Code Zip</td><td><form:input type="text" path="zipCode"/></td>
</tr>
</tr>
</table>

<button type="submit">SAUVER</button>

</pre>
</form:form>
	
	${msg}
<a href="toutAddresses">Voir ADDRESSES</a>

<%@  include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>