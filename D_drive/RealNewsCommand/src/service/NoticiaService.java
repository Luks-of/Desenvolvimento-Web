package service;

import java.util.ArrayList;

import dao.NoticiaDAO;
import models.Noticia;

public class NoticiaService {
	
	private NoticiaDAO nD;
	
	public NoticiaService() {
		
		this.nD = new NoticiaDAO();
	}
	
	
	public void cadastrarNoticia (Noticia n) {
		
		if ( n.getDescricaoNoticia().isEmpty() || n.getTextoNoticia().isEmpty()
				|| n.getTituloNoticia().isEmpty()) {
			
			return;
		
		}	
		if (n.getDescricaoNoticia().length() > 512 || n.getDescricaoNoticia().length() < 3) {
			
			return;
		}
		
		nD.cadastrar(n);
	}
	
	public void alterarNoticia(Noticia n) {
		
		
		if (n.getIdNoticia()<=0 || n.getDescricaoNoticia().isEmpty() || n.getTextoNoticia().isEmpty()
				|| n.getTituloNoticia().isEmpty()) {
			
			return;
		
		}	
		if (n.getDescricaoNoticia().length() > 512 || n.getDescricaoNoticia().length() < 3) {
			
			return;
		}
		
		
		nD.alterar(n);
	}
	
	public void excluirNoticia(Noticia n) {
		
		if ( n.getIdNoticia() <= 0) {
			return;
		}
		
		nD.excluir(n);
	}
	
//	public Noticia consultarNoticia (Noticia n, Comentario c) {
//
//		nD.consultar(n.getIdNoticia());
//		return nD.consultar(n.getIdNoticia());
//	}
	
	public ArrayList<Noticia> listarNoticia(){
		
		nD.listarNoticias();
		return nD.listarNoticias();
		
	}

}
