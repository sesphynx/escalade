<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Benevole</title>
</head>
<body>
<form action="saveBenevole" method="post">
<pre>
Id:<input type="text" name="id" value="${benevole.id}}"/>
NOM:<input type="text" name="nom"  value="${benevole.nom}"/>
PRENOM:<input type="text" name="prenom"  value="${benevole.prenom}"/>
Commune:<form:select  items="${communes}"  path="commune">
<form:option value="${commune.id}">"${commune.nom}"</form:option>
</form:select>
ASC:<form:select  items="${ascs}"  path="asc">
<form:option value="${asc.id}">"${asc.nom}"</form:option>
</form:select>

ADDRESSE:<input type="text" name="addresse"  value="${benevole.addresse}}"/>
EMAIL:<input type="text" name="addresse"  value="${benevole.email}}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayBenevoles">Visualiser  Benevoles</a>
</body>
</html>