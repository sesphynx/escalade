<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Codification</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
</head>
<body>
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
</body>
</html>