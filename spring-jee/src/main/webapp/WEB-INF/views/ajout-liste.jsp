<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout-liste</title>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Ajouter une liste</1>
	</div>
	<div class="container">
		<form action="/spring-jee/ajout-liste" method="post">
			<fieldset>
				<label>Description</label> <input type="text" name="taches"
					class="form-control" required="required"><br> <input
					type="submit" class="btn btn-success" value="Ajouter">
			</fieldset>
		</form>
	</div>

	<script type="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script type="webjars/jquery/3.3.1-1/jquery.min.js"></script>

</body>
</html>