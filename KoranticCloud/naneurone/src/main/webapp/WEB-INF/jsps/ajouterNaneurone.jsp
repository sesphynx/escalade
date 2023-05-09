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
<title>CREER NANEURONE</title>
</head>
<body>

<form:form action="saveNaneurone" method="post" modelAttribute="naneurone">
<table>
<tr><td>ID NANEURONE:</td> <td><form:input type="text" path="naneuroneId"/></td></tr>

<tr><td>ID VERSET:</td> <td><form:input type="text" path="versetId"/></td></tr> 

<tr><td>ID SURAT: </td> <td> <form:input type="text" path="suratId"/></td></tr>

<tr><td>ORDRE: </td> <td><form:input type="text" path="ordre"/></td></tr>

<tr><td>TOUR : </td> <td><form:input type="number" path="tour"/></td></tr>

<tr><td>LIBELLE</td> <td><form:input type="text" path="libelle"/></td></tr>

<tr><td>EXTRACTION</td> <td><form:input type="text" path="extraction"/></td></tr>

<tr><td>VALEUR:</td> <td><form:input type="text" path="valeur"/></td></tr>

<tr><td></td> <td><input type="submit" value="save"/></td></tr>
</table>
</form:form>
${msg}

<a href="displayVersets">AFFICHER LES NANEURONES</a>

</body>
</html>