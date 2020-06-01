<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Real News</title>
</head>
<body>
	
	<h2><b>REAL NEWS</b></h2>
	
	<br><br>
	<c:out value="${ requestScope.mensagem}"/>	
	<br>
	<a href="http://localhost:8080/RealNewsCommand/jsp/CadastrarNoticia.jsp"><button>Cadastrar Notícia</button></a>
	<br>
	<a href="http://localhost:8080/RealNewsCommand/jsp/ExcluirNoticia.jsp"><button>Excluir Notícia</button></a>
	<br>
	<a href="http://localhost:8080/RealNewsCommand/jsp/AlterarNoticia.jsp"><button>Alterar Notícia</button></a>
	<br>
	<a href="http://localhost:8080/RealNewsCommand/jsp/ListarNoticia.jsp"><button>Listar Notícia</button></a>
	<br><br><br>
	
</body>
</html>