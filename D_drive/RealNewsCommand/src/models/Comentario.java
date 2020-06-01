package models;

public class Comentario extends Noticia implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	
//	private int idComentario;
	private String nomeComentario;
	private String textoComentario;
	
	
	public Comentario() {}
	
	public Comentario(int idNoticia, /*int idComentario,*/ String nomeComentario, String textoComentario) {
		
		super(idNoticia);
//		this.idComentario = idComentario;
		this.nomeComentario = nomeComentario;
		this.textoComentario = textoComentario;
	}



//	public int getIdComentario() {
//		return idComentario;
//	}
//
//	public void setIdComentario(int idComentario) {
//		this.idComentario = idComentario;
//	}

	public String getNomeComentario() {
		return nomeComentario;
	}

	public void setNomeComentario(String nomeComentario) {
		this.nomeComentario = nomeComentario;
	}

	public String getTextoComentario() {
		return textoComentario;
	}

	public void setTextoComentario(String textoComentario) {
		this.textoComentario = textoComentario;
	}

}
