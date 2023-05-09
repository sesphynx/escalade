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
<title>CREER CLENT</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
	
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>

<form:form action="sauvegarderClient" method="post" modelAttribute="client">
<pre>
<table class="table table-dark">
<tr>
<td>PRENOM</td>
<td><form:input type="text" path="firstName"/></td>
</tr>
 
<tr>
<td>NOM </td>
<td><form:input type="text" path="lastName"/></td>
</tr>

<tr>
<td>EMAIL </td>
<td><form:input type="text" path="email"/></td>
</tr>

<tr>
<td>PASSWORD </td>
<td><form:input type="password" path="password"/></td>
</tr>


<tr><button type="submit">SAUVER</button></tr>

</table>


</pre>
</form:form>
${msg}
<a href="toutClients">Voir CLIENTS</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>