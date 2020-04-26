package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Noticia;
import service.NoticiaService;

/**
 * Servlet implementation class CadastrarNoticia
 */
@WebServlet("/CadastrarNoticia.do")
public class CadastrarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CAPTUANDO PARAMETROS
		String idNot = request.getParameter("id_noticia");
		String descricaoNoticia = request.getParameter("descricao_noticia");
		String tituloNoticia = request.getParameter("titulo_noticia");
		String textoNoticia = request.getParameter("texto_noticia");
		
		//TRANFORMANDO
		int idNoticia = Integer.parseInt(idNot);
		
		//CRIANDO UM OBJETO DE SESSÃO DO USUARIO
//		HttpSession sessao = request.getSession();

		
		//INSTANCIANDO OBJETO DO TIPO NOTICIA
		Noticia n = new Noticia();
		
		//ATRIBUINDO A UM OBJETO 
		n.setIdNoticia(idNoticia);
		n.setDescricaoNoticia(descricaoNoticia);
		n.setTituloNoticia(tituloNoticia);
		n.setTextoNoticia(textoNoticia);
		
		//ADICIONANDO A NOTICIA A UMA ASESSAO
// 		sessao.setAttribute("noticias", n);
		
		//CHAMANDO A CLASSE SERVICE
		NoticiaService ser = new NoticiaService();
		
		// ENVIANDO INFORMACAOES PARA A SERVICE
		ser.cadastrarNoticia(n);
		
		
	}

}
