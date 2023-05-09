<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Pays</title>
</head>
<body>
<form:form action="savePays" method="post" modelAttribute="pays">
<pre>
Id:<input type="text" name="id" value="${pays.id}" />
Nom:<input type="text" name="name"  value="${pays.nom}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayPayss">View All Payss</a>
</body>
</html>