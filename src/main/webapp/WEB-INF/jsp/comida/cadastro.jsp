<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Comida</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Cadastro de Comida</h2>
	  <form action="/comida/incluir" method="post">
	    <div class="form-group">
	      <label>Código:</label>
	      <input type="text" class="form-control" placeholder="Entre com código" name="codigo">
	    </div>
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome">
	    </div>
	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="number" class="form-control" placeholder="Entre com o seu Valor" name="valor">
	    </div>
		  <div class="form-group">
			  <label>Peso:</label>
			  <input type="number" class="form-control" placeholder="Entre com o Peso" name="peso">
		  </div>
		  <div class="form-group">
			  <label>Perecível:</label>
			  <input class="form-control" list="perecivel-list" id="perecivel" name="perecivel">
			  <datalist id="perecivel-list">
				  <option value="true">
				  <option value="false">
			  </datalist>

		  </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>