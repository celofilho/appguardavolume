<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Condominos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Condominos: ${listagem.size()}</h3>

	  <h4><a href="/condomino">Novo condomino</a></h4>

		<table class="table table-striped">
			<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>CPF</th>
				<th>E-mail</th>
				<th></th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="s" items="${listagem}">
				<tr>
					<td>${s.id}</td>
					<td>${s.nome}</td>
					<td>${s.cpf}</td>
					<td>${s.email}</td>
					<td><a href="/condomino/${s.id}/excluir">excluir</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>