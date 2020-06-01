<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="models.Comentario"%>
<%@ page import="models.Noticia"%>
<%@ page import="service.NoticiaService" %>
<%@ page import="service.ComentarioService"%>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Real News</title>
</head>
		<%
		
		NoticiaService  ser = new NoticiaService();
		ComentarioService serC = new ComentarioService();
		
		
		ArrayList<Noticia> lista = ser.listarNoticia();
		ArrayList<Comentario> lista2 = serC.listarComentario();
		%>

<body>
	<h2><b>REAL NEWS</b></h2><br><br>
	
	<% for (Noticia n : lista) { %>
	
	<b>N° da Notícia: <%=n.getIdNoticia() %> </b>
			<br><b>Descrição: </b> <%= n.getDescricaoNoticia() %>
			<br><b>Título: </b> <%=n.getTituloNoticia() %>
			<br><b>Texto: </b> <%= n.getTextoNoticia()%><br>
			
		<%	for(Comentario c : lista2) {

				if (c.getIdNoticia() == n.getIdNoticia()) { %>
					<br>Nome:  <%=c.getNomeComentario() %>
					<br>Comentário: <%=c.getTextoComentario() %>
					<br>N° Notícia: <%= c.getIdNoticia() %><br>
					
			<%	}	%>	
		<%} %>
		
		<h2>Adicione seu comentário aqui!</h2>
						<form action="../Controller.do" method="post"> 
							
								<td>N° da Notícia:<input type="number" name="id_noticia" size="5"required></td> 
							
							<br> <br>
						
								<td>Nome:<input type="text" name="nome_comentario" size="20"required></td>
						
						<br> <br> 
							
								Comentário:
							<textarea name="texto_comentario" rows="3" cols="30"required></textarea>
							
							<input type="hidden" name="command" value="CadastrarComentario">
	
							<br> <br> <button type="submit" value="Cadastrar Comentario">Comentar</button>
						</form>
					<br>
			
	<%} %>
	<br> <br> 
	<a href="http://localhost:8080/RealNewsCommand/jsp/Home.jsp"><button>Home Notícia</button></a>
</body>
</html>
