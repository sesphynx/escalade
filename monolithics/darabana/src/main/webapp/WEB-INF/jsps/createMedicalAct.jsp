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
<title>CREER ACTEUR MEDICAL</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>

<form:form action="saveMedicalAct" method="post" modelAttribute="medicalAct" >
<table>
<tr>
<td><form:label path="nbreVisites" cssClass="label">Nombre Visites</form:label> </td>
 <td> <form:input type="text" path="nbreVisites" cssClass="input"/></td>
  </tr>

<tr> 
<td>		</td>
 <td><form:button type="submit">SAUVER</form:button></td> </tr>
</table>


</form:form>
	
	${msg}
<a href="displayMedicalActs">Voir Actes M�dicaux</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>

</body>
</html>