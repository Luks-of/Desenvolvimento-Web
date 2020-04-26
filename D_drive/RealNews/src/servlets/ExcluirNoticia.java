package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Noticia;
import service.NoticiaService;

/**
 * Servlet implementation class ExcluirNoticia
 */
@WebServlet("/ExcluirNoticia.do")
public class ExcluirNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CAPTUANDO PARAMETROS
				String idNot = request.getParameter("id_noticia");
				
				//TRANFORMANDO
				int idNoticia = Integer.parseInt(idNot);
				
				//INSTANCIANDO CLASSE DO TIPO NOTICIA
				Noticia n = new Noticia();
				
				//ATRIBUINDO A UM OBJETO 
				n.setIdNoticia(idNoticia);
				
				//CHAMANDO A CLASSE SERVICE
				NoticiaService ser = new NoticiaService();
				
				// ENVIANDO INFORMACAOES PARA A SERVICE
				ser.excluirNoticia(n);
		
		
	}

}
