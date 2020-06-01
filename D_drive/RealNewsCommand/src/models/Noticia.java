package models;

public class Noticia implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idNoticia;
	private String descricaoNoticia;
	private String tituloNoticia;
	private String textoNoticia;
	
	public Noticia() {}

	public Noticia(int idNoticia, String descricaoNoticia, String tituloNoticia, String textoNoticia) {
		
		this.descricaoNoticia = descricaoNoticia;
		this.tituloNoticia = tituloNoticia;
		this.textoNoticia = textoNoticia;
	}
	public Noticia(int idNoticia) {
		
		this.idNoticia = idNoticia;
	}

	public int getIdNoticia() {
		return idNoticia;
	}

	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}

	public String getDescricaoNoticia() {
		return descricaoNoticia;
	}

	public void setDescricaoNoticia(String descricaoNoticia) {
		this.descricaoNoticia = descricaoNoticia;
	}

	public String getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public String getTextoNoticia() {
		return textoNoticia;
	}

	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}

}
