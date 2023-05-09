<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Daara</title>
</head>
<body>

	<form action="daara" method="post">
		<pre>
Localisation:<input type="text" name="localisation" />
nbreEnfants:<input type="text" name="nbreEnfants">
nbrePieces:<input type="text" name="nbrePieces" />
Couverture Medicale:OUI<input type="radio" name="couvertureMedicale"
				value="OUI" />
					NON<input type="radio" name="couvertureMedicale" value="NON" />

<input type="submit" value="sauver">
</pre>
	</form>

</body>
</html>