<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Role</title>
</head>
<body>
<form:form action="saveRole" method="post" modelAttribute="role">
<pre>
Id:<input type="text" name="id" value="${role.id}" />
Name:<input type="text" name="name"  value="${role.name}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayRoles">View All Roles</a>
</body>
</html>