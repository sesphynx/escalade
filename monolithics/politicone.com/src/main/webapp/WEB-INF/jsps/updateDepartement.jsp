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
<title>Edite Departement</title>
</head>
<body>
<form:form action="saveDepartement" method="post" modelAttribute="departement">
<pre>
Id:<input type="text" name="id" value="${departement.id}" />
Region:<form:select  items="${regions}"  path="${region}">
<form:option value="${region.id}">"${region.nom}"</form:option>
</form:select>
Nom:<input type="text" name="nom"  value="${departement.nom}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayDepartements">View All Departements</a>
</body>
</html>