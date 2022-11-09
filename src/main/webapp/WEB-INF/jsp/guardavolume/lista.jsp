<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Guarda Volumes</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Guarda Volumess: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
			<tr>
				<th>ID</th>
				<th>Descri��o</th>
				<th>Data</th>
				<th>Condomino</th>
				<th>Volumes</th>
				<th></th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="p" items="${listagem}">
				<tr>
					<td>${p.id}</td>
					<td>${p.descricao}</td>
					<td>${p.data}</td>
					<td>${p.condomino.nome}</td>
					<td>${p.volumes.size()}</td>
					<td><a href="/guardavolume/${p.id}/excluir">excluir</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>