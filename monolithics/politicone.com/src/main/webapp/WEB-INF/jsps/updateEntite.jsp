<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Entite</title>
</head>
<body>
<form:form action="saveEntite" method="post" modelAttribute="entite">
<pre>
Id:<input type="text" name="id" value="${entite.id}" />
Nom:<input type="text" name="name"  value="${entite.nom}"/>
Envergure:<input type="text" name="name"  value="${entite.envergure}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayEntites">Affciher les Entites</a>
</body>
</html>