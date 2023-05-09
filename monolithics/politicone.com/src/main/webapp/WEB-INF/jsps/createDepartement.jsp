<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER DEPARTEMENT</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>

<hr />
<br />
<form:form action="saveDepartement" method="post" modelAttribute="departement">
<table>
<tr> 
<td>Region</td>  <td> </td> <td><form:select  path="region"><form:option value=" " label="Selectionner"/><form:options items="${regions}"  itemLabel="nom" itemValue="id"/></form:select>
</td>
</tr>
<br></br>
<tr> 
<td>NOM</td>  <td> </td>  <td><form:input type="text" path="nom"/></td>
</tr>
 <br></br>
<tr> 
<td></td>  <td> <input type="submit" value="SAUVER" /> </td>  <td></td>
</tr>
</table>
</form:form>
	
	${msg}
<a href="displayDepartements">Voir DEPARTEMENTS</a>
<br></br>
<hr></hr>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>


</body>
</html>