package service;

import java.util.ArrayList;

import dao.ComentarioDAO;
import models.Comentario;

public class ComentarioService {
	
	private ComentarioDAO cD;
	
	public ComentarioService() {
		
		this.cD = new ComentarioDAO();
	}
	
	
	public void cadastrarComentario (Comentario c) {
		
		if (c.getIdNoticia()<= 0 || c.getNomeComentario().isEmpty() || c.getTextoComentario().isEmpty()) {
			
			return;
		}
		
		if (c.getNomeComentario().length() > 126 || c.getNomeComentario().length()<3 ||
				c.getTextoComentario().length() > 512 || c.getTextoComentario().length() < 3) {
			
			return;
		}
		
		cD.cadastrar(c);
	}
	
//	public void alterarComentario (Comentario c) {
//		
//		cD.alterar(c);
//	}
//	
//	public void excluirComentario (Comentario c) {
//		
//		cD.excluir(c);
//	}
//	
//	public Comentario consultarComentario  (Comentario c) {
//		
//		cD.consultar(c.getIdComentario());
//		return cD.consultar(c.getIdComentario(), c.getIdNoticia());
//		
//	}
	
	public ArrayList<Comentario> listarComentario(){
		
		cD.listarComentario();
		return cD.listarComentario ();
		
	}

}


