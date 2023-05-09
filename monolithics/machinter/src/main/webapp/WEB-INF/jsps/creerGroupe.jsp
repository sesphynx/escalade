<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Operateur</title>
</head>
<body>
<form action="enregistrerGroupe" method="post">
<pre>
Designation: <input type="text" name="designation" />
Heure Descente:<input type="text" name="heureDescente"/>
Heure Siege: <input type="text" name="heureSiege">
<input type="submit" value="submit">
</pre>
</form>
${msg}
<a href="afficherAllGroupes">Groupes Fonctionnels</a>
</body>
</html>