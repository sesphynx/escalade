<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Parrain</title>
</head>
<body>
<form action="saveParrain" method="post">
<pre>
Id:<input type="text" name="id" value="${parrain.id}"/>
NOM:<input type="text" name="nom"  value="${parrain.nom}"/>
PRENOM:<input type="text" name="prenom"  value="${parrain.prenom}"/>
EMAIL:<input type="text" name="email"  value="${parrain.email}"/>
ADDRESSE:<input type="text" name="addresse"  value="${parrain.addresse}"/>
DUREE:<input type="text" name="duree"  value="${parrain.duree}"/>
DESCRIPTIF:<input type="text" name="descriptif"  value="${parrain.descriptif}"/>
MONTANT:<input type="text" name="montant"  value="${parrain.montant}"/>
TYPE PARRAINAGE:<input type="text" name="typeParrainage"  value="${parrain.typeParrainage}}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayParrains">View All Parrains</a>
</body>
</html>