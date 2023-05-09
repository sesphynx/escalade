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
<title>CREER VILLAGE</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<hr></hr>
<form:form action="saveVillage" method="post" modelAttribute="village">
<pre>
<td>Commune Arrondissement </td> <td> </td> <td>
<form:select    path="communeArrond">
<form:option value="0" label="SELECTIONNER" />
<form:options itemValue="id" itemLabel="nom" />
</form:select></td>
<td></td>NOM <td></td> <td><form:input type="text" path="nom"/></td>
<td></td><td><button type="submit">SAUVER</button></td>

</pre>
</form:form>
	
	${msg}
<a href="displayVillages">Voir VILLAGES</a>
<br></br>
<hr></hr>
<br></br>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
<br></br>
</body>
</html>