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
<title>CREER COMMUNE D'ARONDISSEMENT</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>

<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<hr></hr>
<br></br>
<form:form action="saveCommuneArrond" method="post" modelAttribute="communeArrond">
<pre>
<td>Departement</td> <td> </td> <form:select    path="departement">
<form:option value="0" label="Selectionner"></form:option>
<form:options items="${departements}" itemLabel="nom" itemValue="id"></form:options>
</form:select>

NOM <form:input type="text" path="nom"/>
<button type="submit">SAUVER</button>

</pre>
</form:form>
	
	${msg}
<a href="displayCommuneArronds">Voir COMMISSIONS</a>
<br></br>
<hr></hr>
<br></br>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>