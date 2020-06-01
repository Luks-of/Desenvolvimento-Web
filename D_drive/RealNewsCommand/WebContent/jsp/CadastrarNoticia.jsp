<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Noticia</title>
</head>
	<h5>CADASTRE SUA NOTÍCIA AQUI!</h5>
	<form action="../Controller.do" method="post">
		 <br>
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
		<br> <br> 
		<input type="hidden" name="command" value="CadastrarNoticia">
		
		<input type="submit" value="Cadastrar">
	</form>


<body>

</body>
</html>