<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer MedicalActor</title>
</head>
<body>
<form action="saveMedicalActor" method="post">
<pre>
Id:<input type="text" name="id" value="${medicalActor.id}}"/>
NOM:<input type="text" name="nom"  value="${medicalActor.nom}"/>
PRENOM:<input type="text" name="prenom"  value="${medicalActor.prenom}"/>
DAARA:<input type="text" name="email"  value="${medicalActor.daara.id}"/>
ADDRESSE:<input type="text" name="addresse"  value="${medicalActor.addresse}"/>
EMAIL:<input type="text" name="email"  value="${medicalActor.email}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayMedicalActors">View All MedicalActors</a>
</body>
</html>