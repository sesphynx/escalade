<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Parent</title>
</head>
<body>
<form action="saveParent" method="post">
<pre>
Id:<input type="text" name="id" value="${parent.id}}"/>
NOM:<input type="text" name="nom"  value="${parent.nom}"/>
PRENOM:<input type="text" name="prenom"  value="${parent.prenom}"/>
ADDRESSE:<input type="text" name="addresse"  value="${parent.addresse}}"/>
PARENT:<input type="text" name="email"  value="${parent.email}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayParents">View All Parents</a>
</body>
</html>