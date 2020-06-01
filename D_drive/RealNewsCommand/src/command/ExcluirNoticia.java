package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Noticia;
import service.NoticiaService;

public class ExcluirNoticia implements Command{

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//ADICIONANDO UM OBJETO DE SAIDA
		PrintWriter saida = response.getWriter();

		// CAPTUANDO PARAMETROS
		String idNot = request.getParameter("id_noticia");

		// TRANFORMANDO
		int idNoticia = Integer.parseInt(idNot);

		// INSTANCIANDO CLASSE DO TIPO NOTICIA
		Noticia n = new Noticia();

		// ATRIBUINDO A UM OBJETO
		n.setIdNoticia(idNoticia);

		// CHAMANDO A CLASSE SERVICE
		NoticiaService ser = new NoticiaService();

		// ENVIANDO INFORMACAOES PARA A SERVICE
		ser.excluirNoticia(n);
		
		response.setContentType("text/html");
		
		saida.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Comentar</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h2><b>REAL NEWS</b></h2><br><br>");
		
		saida.println("<h5><b>Not�cia Excluida com sucesso!!</b></h5>");

		
		saida.println("<a href="+"http://localhost:8080/RealNewsCommand/jsp/Home.jsp>"+"<button>Home Not�cia</button></a>"+ 
				"</body>" + 
				"</html>");

	}



}
