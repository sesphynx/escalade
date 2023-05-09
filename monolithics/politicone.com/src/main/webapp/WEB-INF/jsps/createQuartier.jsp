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
<title>CREER QUARTIER</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>
<hr></hr>
<br></br>
<form:form action="saveQuartier" method="post" modelAttribute="quartier">
<pre>  <tr><td></td><td></td></tr>
<tr>
<td>Commune:</td>  <td> </td> <td><form:select  path="commune">
<form:option value=" " label="Choisir"></form:option>
<form:options items="${communes}"  itemLabel="nom"  itemValue="id"></form:options>
</form:select></td>
</tr> 
<br></br>
 <tr><td>NOM</td>  <td> </td> <td><form:input type="text" path="nom"/></td></tr>
 <br></br>
 <tr>
        <td colspan="2"><input type="submit" value="Inscrire"></td>
    </tr>
</pre>
</form:form>
	
	${msg}
<a href="displayQuartiers">Voir QUARTIERS</a>
<br></br><hr></hr><br></br>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>