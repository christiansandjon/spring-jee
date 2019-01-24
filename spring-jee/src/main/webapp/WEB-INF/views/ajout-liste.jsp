<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<h1>Ajouter une liste</h1>
	</div>
	
	<div class="container">
	
		<form:form modelAttribute="liste" action="/spring-jee/ajout-liste" method="post">
			
			<fieldset class="form-group">
		<form:input path="description" type="text" class="form-control" required="required"/>
		<form:errors path="description" cssClass="text-warning" /></fieldset>
		<input type="submit" class="btn btn-success" value="Ajouter"/>

		</form:form>

		
	</div>

	<script type="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script type="webjars/jquery/3.3.1-1/jquery.min.js"></script>

</body>
</html>