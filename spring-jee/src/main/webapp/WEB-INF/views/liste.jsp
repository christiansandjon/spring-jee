<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des taches</title>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h1>
		<font color=blue>${login}</font>
	</h1>
	
	<div class="container">
	<h1>
		Voici la liste des taches<font color=blue>${login}</font>
	</h1>
	</div>
	<div class="container">
<caption>Les taches sont :</caption>
		<table class="table table-striped">
		
			<thead>
				<tr>
					<th>Utilisateur</th>
					<th>Tache</th>
					<th>Date</th>
				
			
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${liste}" var="liste">
					<tr>
						<td>${liste.user}</td>
						<td>${liste.taches}</td>
						<td>${liste.date}</td>
						
						
						<td><a class="btn btn-danger" href="/spring-jee/delete-liste?id=${liste.id}">Supprimer</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container">
	<a class="btn btn-success" href="/spring-jee/ajout-liste">Ajouter</a>
	</div>
	
	<script type="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script type="webjars/jquery/3.3.1-1/jquery.min.js"></script>

</body>
</html>