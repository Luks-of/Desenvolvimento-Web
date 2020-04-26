package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Comentario;
import models.Noticia;
import service.ComentarioService;
import service.NoticiaService;

/**
 * Servlet implementation class ListarNoticia
 */
@WebServlet("/ListarNoticia.do")
public class ListarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//INSTANCIANDO UM OBJETO DE SAIDA
		PrintWriter saida = response.getWriter();
		
		NoticiaService  ser = new NoticiaService();
		ComentarioService serC = new ComentarioService();
		
		
		ArrayList<Noticia> lista = ser.listarNoticia();
		ArrayList<Comentario> lista2 = serC.listarComentario();
		
		saida.println("<h2><b>REAL NEWS</b></h2><br><br>");
		
		for (Noticia n : lista) {
			
			saida.println("<h4>N° da Notícia:" + n.getIdNoticia()+ "</h4>"
			+ "<br><b>Descrição:</b> " + n.getDescricaoNoticia() 
			+ "<br><b>Título:</b> " + n.getTituloNoticia()
			+ "<br><b>Texto:</b> " + n.getTextoNoticia() + "<br>");
			
			
			
			for(Comentario c : lista2) {

				if (c.getIdNoticia() == n.getIdNoticia()) {
					saida.println("<br>Nome: " + c.getNomeComentario()
					+ "<br>Comentário: " + c.getTextoComentario()
					+ "<br>N° Notícia: " + c.getIdNoticia() + "<br>");
					
				}				
			}
			saida.println("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Comentar</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<h2>Adicione seu comentário aqui!</h2>\r\n" + 
					"	<form action=\"CadastrarComentario.do\" method=\"post\">\r\n" + 
					"		<tr>\r\n" + 
					"			N° da Notícia:<input type=\"number\" name=\"id_noticia\" size=\"5\">\r\n" + 
					"		</tr>\r\n" + 
					"		<br> <br>\r\n" + 
					"		<tr>\r\n" + 
					"			Nome:\r\n" + 
					"			<input type=\"text\" name=\"nome_comentario\" size=\"20\">\r\n" + 
					"		</tr>\r\n" + 
					"		<br> <br>\r\n" + 
					"		<tr>\r\n" + 
					"			Texto:\r\n" + 
					"			<textarea name=\"texto_comentario\" rows=\"3\" cols=\"30\"></textarea>\r\n" + 
					"		</tr>\r\n" + 
					"		<br> <br> <input type=\"submit\" />\r\n" + 
					"	</form>\r\n" + 
					"<br>\r\n" + 
					"		<a href=\"http://localhost:8080/RealNews/homeNoticia.html\"><button>Home Notícia</button></a>\r\n" + 
					"</body>\r\n" + 
					"</html>");

		}
	}
}

