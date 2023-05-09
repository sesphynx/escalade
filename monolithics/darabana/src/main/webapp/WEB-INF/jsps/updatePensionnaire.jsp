<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Pensionnaire</title>
</head>
<body>
<form action="savePensionnaire" method="post">
<pre>
Id:<input type="text" name="id" value="${pensionnaire.id}}"/>
NOM:<input type="text" name="nom"  value="${pensionnaire.nom}"/>
PRENOM:<input type="text" name="prenom"  value="${pensionnaire.prenom}"/>
DAARA:<input type="text" name="email"  value="${pensionnaire.daara.id}"/>
ADDRESSE:<input type="text" name="addresse"  value="${pensionnaire.addresse}}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayPensionnaires">View All Pensionnaires</a>
</body>
</html>