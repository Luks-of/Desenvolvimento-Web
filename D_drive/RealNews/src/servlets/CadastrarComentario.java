package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Comentario;
import service.ComentarioService;

/**
 * Servlet implementation class CadastrarComentario
 */
@WebServlet("/CadastrarComentario.do")
public class CadastrarComentario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CAPTURANDO PARAMETROS
		String idNot = request.getParameter("id_noticia");
		//String idCom = request.getParameter("id_comentario");
		String nome = request.getParameter("nome_comentario");
		String texto = request.getParameter("texto_comentario");
		
		//ATRIBUINDO UMA SESSAO
//		HttpSession sessao = request.getSession();

		//TRANSFORMANDO
		int idNoticia = Integer.parseInt(idNot);
		//int idComentario = Integer.parseInt(idCom);
		
		//ISNTANCIANDO UM OBJETO
		Comentario com = new Comentario();
		
		//ATRIBUINDO VALORES AO OBJETO
		com.setIdNoticia(idNoticia);
		//com.setIdComentario(idComentario);
		com.setNomeComentario(nome);
		com.setTextoComentario(texto);
		
		//ADICIONANDO COMENTARIO A SESAO DO USUARIO
//		sessao.setAttribute("comentarios", com);
				
				
		//CHAMANDO UMA CLASSE SERVICE
		ComentarioService ser = new ComentarioService();
		
		//ENVIANDO OS VALORES PARA A SERVICE
		ser.cadastrarComentario(com);
		
		
		//request.getRequestDispatcher("");
		response.sendRedirect("http://localhost:8080/RealNews/ListarNoticia.do");
	}

}
