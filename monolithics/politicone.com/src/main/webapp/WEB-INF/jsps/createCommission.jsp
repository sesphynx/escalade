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
<title>CREER COMMISSION</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%> 
<hr></hr>
<br></br>
<form:form action="saveCommission" method="post" modelAttribute="commission">
<table>
<tr> 
<td>Region</td>  <td> </td> <td><form:select  path="region"><form:option value="0" label="Choisir"></form:option><form:options  items="${regions}" itemLabel="nom" itemValue="id" /></form:select></td>
</tr>
<br></br>
<tr> 
<td>NUMERO </td>  <td> </td>  <td><form:input type="text" path="numero"/></td>
</tr>
 <br></br>
<tr> 
<td></td>  <td> <button type="submit">SAUVER</button></td>  <td></td>
</tr>
</table>
</form:form>
${msg}
<a href="displayCommissions">Voir COMMISSIONS</a>
<br></br>
<hr></hr>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>