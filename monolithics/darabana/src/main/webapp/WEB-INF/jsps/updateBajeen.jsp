<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Bajeen</title>
</head>
<body>
<form action="saveBajeen" method="post">
<pre>
Id:<input type="text" name="id" value="${bajeen.id}"/>
Nom:<input type="text" name="nom"  value="${bajeen.nom}"/>
Prenom:<input type="text" name="prenom"  value="${bajeen.prenom}"/>
Email:<input type="text" name="email"  value="${bajeen.email}"/>
Addresse:<input type="text" name="addresse"  value="${bajeen.addresse}"/>
Commune:<input type="text" name="prenom"  value="${bajeen.commune.nom}}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayBajeens">View All Bajeens</a>
</body>
</html>