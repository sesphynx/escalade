<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Communication</title>
</head>
<body>
<form:form action="saveCommunication" method="post" modelAttribute="communication">
<pre>
Id:<input type="text" name="id" value="${communication.id}" />
Entite:<form:select  items="${entites}"  path="${entite}">
<form:option value="${entite.id}">"${entite.nom}"</form:option>
</form:select>
Descriptif:<input type="text" name="name"  value="${communication.descriptif}"/>
Libellé:<input type="text" name="libelle"  value="${communication.libelle}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayCommunications">View All Communications</a>
</body>
</html>