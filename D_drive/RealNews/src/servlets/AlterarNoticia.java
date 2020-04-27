package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Noticia;
import service.NoticiaService;

/**
 * Servlet implementation class AlterarNoticia
 */
@WebServlet("/AlterarNoticia.do")
public class AlterarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ADICIONANDO UM OBJETO DE SAIDA
		PrintWriter saida = response.getWriter();
		// CAPTUANDO PARAMETROS
		String idNot = request.getParameter("id_noticia");
		String descricaoNoticia = request.getParameter("descricao_noticia");
		String tituloNoticia = request.getParameter("titulo_noticia");
		String textoNoticia = request.getParameter("texto_noticia");

		// TRANFORMANDO
		int idNoticia = Integer.parseInt(idNot);

		// INSTANCIANDO CLASSE DO TIPO NOTICIA
		Noticia n = new Noticia();

		// ATRIBUINDO A UM OBJETO
		n.setIdNoticia(idNoticia);
		n.setDescricaoNoticia(descricaoNoticia);
		n.setTituloNoticia(tituloNoticia);
		n.setTextoNoticia(textoNoticia);

		// CHAMANDO A CLASSE SERVICE
		NoticiaService ser = new NoticiaService();

		// ENVIANDO INFORMACAOES PARA A SERVICE
		ser.alterarNoticia(n);
		
		response.setContentType("text/html");
		
		saida.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Comentar</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h2><b>REAL NEWS</b></h2><br><br>");
		
		saida.println("<h5><b>Notícia Alterada com sucesso!!</b></h5>");

		
		saida.println("<a href="+"http://localhost:8080/RealNews/homeNoticia.html>"+"<button>Home Notícia</button></a>"+ 
				"</body>" + 
				"</html>");

	}

}
