<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Absence</title>
</head>
<body>
<form action="creerAbsence" method="post">
<pre>
conseiller <input type="text" name="conseiller" />
date <input type="text" name="dateAbsence"/>
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<a href="afficherAllAbsences">Absences</a>
</body>
</html>