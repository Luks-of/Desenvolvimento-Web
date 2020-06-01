<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EXCLUSÃO NOTICIAS</title>
</head>
<body>
<h2><b>REAL NEWS</b></h2>
<br>
	<h5>EXCLUA SUA NOTÍCIA AQUI!</h5>
	<form action="../Controller.do" method="post">
		<tr>
			N° da Notícia:<input type="number" name="id_noticia" size="5"required>
		</tr>
		<input type="hidden" name="command" value="ExcluirNoticia">
		<br> <br> <input type="submit" value="Excluir">
	</form>
	
	<br>
		<a href="http://localhost:8080/RealNewsCommand/jsp/Home.jsp"><button>Home Notícia</button></a>

</body>
</html>