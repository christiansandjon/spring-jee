<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des taches</title>
</head>
<body>
	<h1>
		<font color=blue>${login}</font>
	</h1>
	<h1>
		voici la liste des taches<font color=blue>${login}</font>
	</h1>

	<h1>Liste des taches</h1>

	<div>
		<table>
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
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<a class="Button" href="/spring-jee/ajout-liste">Ajouter</a>
	<br>
	<a class="Button" href="/spring-jee/delete-liste">Supprimer</a>

</body>
</html>