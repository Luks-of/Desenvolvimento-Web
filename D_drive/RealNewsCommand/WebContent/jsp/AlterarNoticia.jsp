<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALTERAÇÃO NOTICIAS</title>
</head>
<body>
<h2><b>REAL NEWS</b></h2>
<br>
	<h2>ALTERE SUA NOTÍCIA AQUI!</h2>
	<form action="../Controller.do" method="post">
		<tr>
			N° da Notícia:
			<input type="number" name="id_noticia" size="5"required>
		</tr>
		<br> <br>
		<tr>
			Descrição:
			<textarea name="descricao_noticia" rows="4" cols="20"required></textarea>
		</tr>
		<br> <br>
		<tr>
			Título:
			<input type="text" name="titulo_noticia" size="20"required>
		</tr>
		<br> <br>
		<tr>
			Texto:
			<textarea name="texto_noticia" rows="12" cols="20"required></textarea>
		</tr>
		<input type="hidden" name="command" value="AlterarNoticia">
		<br> <br> <input type="submit" value="Alterar">
	</form>
	<br>
		<a href="http://localhost:8080/RealNewsCommand/jsp/Home.jsp"><button>Home Notícia</button></a>

</body>
</html>