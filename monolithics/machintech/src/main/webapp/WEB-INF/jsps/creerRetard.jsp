<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Retard</title>
</head>
<body>
<form action="enregistrerRetard" method="post">
<pre>
Entree<input type="text" name="entree" />
Arrivee<input type="text" name="arrivee"/>
<input type="submit" value="submit">
</pre>
</form>
${msg}
<a href="afficherAllRetards">Retards Enregistrés</a>
</body>
</html>