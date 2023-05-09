<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Federation</title>
</head>
<body>
<form:form action="saveFederation" method="post" modelAttribute="federation">
<pre>
Id:<input type="text" name="id" value="${federation.id}" />
Pays:<form:select  items="${payss}"  path="${pays}">
<form:option value="${pays.id}">"${pays.nom}"</form:option>
</form:select>
Nom:<input type="text" name="name"  value="${federation.nom}"/>
Numero:<input type="text" name="name"  value="${federation.numero}"/>


	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayFederations">View All Federations</a>
</body>
</html>