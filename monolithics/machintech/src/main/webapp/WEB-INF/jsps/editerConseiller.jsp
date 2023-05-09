<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Conseiller</title>
</head>
<body>
<form action="editerUser" method="post">
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
ALLONYME <input type="text" name="allonyme" value="allonyme">
<input type="submit" value="enregistrerConseiller">
<a href="afficherAllConseillers" >Conseillers</a>
</pre>
</form>
</body>
</html>