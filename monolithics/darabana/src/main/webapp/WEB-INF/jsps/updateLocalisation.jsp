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
<title>Editer Localisation</title>
</head>
<body>
<form action="saveLocalisation" method="post">
<pre>
Region:<input type="text" name="region" value="${localisation.region}"/>
Commune:<form:select  items="${communes}"  path="commune">
<form:option value="${commune.id}">"${commune.nom}"</form:option>
</form:select>
Quartier:<input type="text" name="quartier"  value="${localisation.quartier}"/>
Addresse:<input type="text" name="addresse"  value="${localisation.addresse}"/>
	<input type="submit" value="save">
	</pre>
</form>
${msg}
<a href="displayLocalisations">View All Localisations</a>
</body>
</html>