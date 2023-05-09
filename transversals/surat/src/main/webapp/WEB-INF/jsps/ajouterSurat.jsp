<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERER SURAT</title>
</head>
<body>

<form:form action="saveSurat" method="post" modelAttribute="surat">
<table>

<tr><td>Id Surat:</td> <td><form:input type="text" path="suratId"/></td></tr> 

<tr><td>ORDRE: </td> <td> <form:input type="text" path="ordre"/></td></tr>

<tr><td>TOUR: </td> <td><form:input type="text" path="tour"/></td></tr>

<tr><td></td> <td><input type="submit" value="save"/></td></tr>

</table>
</form:form>
${msg}

<a href="displaySurats">AFFICHER LES SURATS</a>

</body>
</html>