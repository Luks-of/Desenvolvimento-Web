package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Comentario;
import service.ComentarioService;

public class CadastrarComentario implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// CAPTURANDO PARAMETROS
		String idNot = request.getParameter("id_noticia");
		String nome = request.getParameter("nome_comentario");
		String texto = request.getParameter("texto_comentario");

		// TRANSFORMANDO
		int idNoticia = Integer.parseInt(idNot);
		// int idComentario = Integer.parseInt(idCom);

		// ISNTANCIANDO UM OBJETO
		Comentario com = new Comentario();

		// ATRIBUINDO VALORES AO OBJETO
		com.setIdNoticia(idNoticia);
		// com.setIdComentario(idComentario);
		com.setNomeComentario(nome);
		com.setTextoComentario(texto);

		// CHAMANDO UMA CLASSE SERVICE
		ComentarioService ser = new ComentarioService();

		// ENVIANDO OS VALORES PARA A SERVICE
		ser.cadastrarComentario(com);

		// request.getRequestDispatcher("");
		response.sendRedirect("http://localhost:8080/RealNewsCommand/jsp/ListarNoticia.jsp");

	}

}
