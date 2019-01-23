<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>

     <h1>Bienvenu à toi <font color=blue>${login}</font></h1><br>
     <p>ton mot de passe est <font color=blue>${password}</font></p>
     <p><a href= "/spring-jee/liste">Voici ta liste des taches à effectuer</a></p>
</body>
</html>