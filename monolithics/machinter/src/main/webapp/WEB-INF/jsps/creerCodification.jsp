<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Codification</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
	<form action="enregistrerCodification"  method="post">
		<pre>
Conseiller:<input type="text" name="conseillerId" />
Date Codification:<input type="text" name="dateCodif" />
Prospect:<input type="text" name="prospectId" />
Prospect:<input type="text" name="prospectId" />
Type Codification :NRP-BV<input type="radio" name="typeCodif" value="NRP-BV" />
	 Codification :Raccroche<input type="radio" name="typeCodif" value="RACCROCHE" />
	 Codification :Rappel<input type="radio" name="typeCodif" value="RAPPEL" />
	 Codification :Vente<input type="radio" name="typeCodif" value="VENTE" />
<input type="submit" value="submit">
</pre>
	</form>
	${msg}
	<a href="afficherAllCodifications">Codifications Enregistrés</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>