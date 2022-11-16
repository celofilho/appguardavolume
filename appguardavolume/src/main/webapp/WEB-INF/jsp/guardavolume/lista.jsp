<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Pedidos</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
	<h3>Guarda Volumes: ${listagem.size()}</h3>

	<h4><a href="/guardavolume">Novo Guarda Volume</a></h4>

	<table class="table table-striped">
		<thead>
		<tr>
			<th>ID</th>
			<th>Descrição</th>
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
				<td>${p.web}</td>
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