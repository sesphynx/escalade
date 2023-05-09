<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Commune</title>
</head>
<body>
<form action="saveCommune" method="post">
<pre>
Id:<input type="text" name="id" value="${commune.id}"/>
NOM<input type="text" name="name"  value="${commune.nom}"/>
<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayCommunes">View All Communes</a>
</body>
</html>