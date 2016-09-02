<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css"/>"/>	
	<title>Cadastrar</title>
</head>
<body class="container">
	<div class="jumbotron"><h2>Cadastro</h2></div>
	<div class="panel-body">
		<form action="/servletApp/cadastrar" method="POST">
  			<div class="form-group">
  				<label>Nome:</label>
  			</div>
  			<div class="form-group">
  				<input type="text" name="nome" class="form-control"/>
  			</div>
  			<div class="form-group">
  				<input type="submit" value="Enviar" class="btn btn-primary"/>
        		<a class="btn btn-primary" href="/servletApp/">Voltar</a>
        		<a class="btn btn-primary" href="/servletApp/listar">Listar</a>  
  			</div>
  		</form>
  	</div>
</body>
</html>