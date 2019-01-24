<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container">
		<h1><font color=Blue>Connexion</font></h1>
	</div>
	<div class="container">
		<form method="post" action="/spring-jee/servlet">
			<p>
				<font color=red>${error}</font>
			</p>
			<p>
				<font color=red>${erreur}</font>
			</p>

				<label for="login">Login <span class="requis">*</span></label> 
				<input type="text" id="login" name="login" value="Chris"
					 /> <br /> 
				<label for="password">Mot de passe <span class="requis">*</span></label> 
				<input type="password" id="password" name="password" value="a"
					  /> <br /> 
				<input type="submit" value="Connexion" class="btn btn-primary" /><br>
				<input type="submit" value="Pas encore de Compte ? Inscription ->" 
				class="btn btn-link" />
				
		</form>
	</div>
	<script type="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script type="webjars/jquery/3.3.1-1/jquery.min.js"></script>
</body>
</html>