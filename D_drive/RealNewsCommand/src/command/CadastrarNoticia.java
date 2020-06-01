package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Noticia;
import service.NoticiaService;

public class CadastrarNoticia implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//CAPTUANDO PARAMETROS
		String descricaoNoticia = request.getParameter("descricao_noticia");
		String tituloNoticia = request.getParameter("titulo_noticia");
		String textoNoticia = request.getParameter("texto_noticia");
		
		
		//INSTANCIANDO OBJETO DO TIPO NOTICIA
		Noticia n = new Noticia();
		
		//ATRIBUINDO A UM OBJETO 
		n.setDescricaoNoticia(descricaoNoticia);
		n.setTituloNoticia(tituloNoticia);
		n.setTextoNoticia(textoNoticia);
		
		
		//CHAMANDO A CLASSE SERVICE
		NoticiaService ser = new NoticiaService();
		
		// ENVIANDO INFORMACAOES PARA A SERVICE
		ser.cadastrarNoticia(n);

		// Exibir mensagem
		// Adicionando uma informação à requisição:
		//request.setAttribute("mensagem", "Noticia cadastrada com sucesso!!!");
		try {
			// Redirecionando o usuário: (despachando)
			//request.getRequestDispatcher("/jsp/Home.jsp").forward(request, response);
			response.sendRedirect("http://localhost:8080/RealNewsCommand/jsp/Home.jsp");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
