<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Acte Medical</title>
</head>
<body>
<form action="saveMedicalAct" method="post">
<pre>
Id:<input type="text" name="id" value="${medicalAct.id}"/>
NOMBRE VISITES <input type="text" name="nom"  value="${medicalAct.nom}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayMedicalActs">View All MedicalActs</a>
</body>
</html>