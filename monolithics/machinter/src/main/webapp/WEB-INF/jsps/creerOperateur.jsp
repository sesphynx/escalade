<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Operateur</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<form action="enregistrerOperateur" method="post">
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<pre>
Nom:<input type="text" name="nom"/>
<input type="submit" value="submit">
</pre>
</form>
${msg}
<a href="afficherAllOperateurs">Operateurs Enregistrés</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>