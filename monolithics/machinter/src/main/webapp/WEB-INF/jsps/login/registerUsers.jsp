<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription Utilisateurs</title>
</head>
<body>
<form action="registerUser">
<pre>
NOM  <input type="text" value="nom">
PRENOM  <input type="text" value="prenom">
ADDRESSE <input type="text" value="addresse">
EMAIL <input type="text" value="email">
TEL   <input type="text" value="numeroTel">
PASS <input type="password" value="password">
CONFIRMPASS <input type="password" value="password">
ROLE:MANAGER <input type="radio" name="role" value="MANAGER">
	 SUPERVISEUR <input type="radio" name="role" value="SUPERVISEUR">
	 CONSEILLER <input type="radio" name="role" value="CONSEILLER">
<input type="submit" value="enregistrer">
</pre>
</form>

</body>
</html>