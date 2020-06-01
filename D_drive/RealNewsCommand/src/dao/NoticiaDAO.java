package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Noticia;

public class NoticiaDAO {
	
	//atributo de conexao
	private Connection conexao;
	
	//construtor
	public NoticiaDAO(){
		this.conexao = ConnectionFactory.conectar();
	}
	
	
	//CADASTRANDO NOTICIA NO BANCO DE DADOS
	public void cadastrar(Noticia noticia) {
		
		String inserir = "INSERT INTO noticia " +
				"(descricao, titulo, texto) " + 
				"VALUES ( ?, ?, ?)";
		
		try( PreparedStatement pst = conexao.prepareStatement(inserir)){
			
			pst.setString(1, noticia.getDescricaoNoticia());
			pst.setString(2, noticia.getTituloNoticia());
			pst.setString(3, noticia.getTextoNoticia());
			
			pst.execute();
			
		} catch(SQLException ex) {
			
			System.err.println("Não foi possível manipular a tabela NOTICIA!!");
			ex.printStackTrace();			
		}
	}
	
	
	
	//ALTERANDO NOTICIA NO BANCO DE DADOS
	public void alterar (Noticia noticia) {
		
		String inserir = "UPDATE noticia SET descricao = ?, "
				+ "titulo = ?, texto = ? WHERE id = ?";
		
		try (PreparedStatement pst = conexao.prepareStatement(inserir)){
	
			pst.setString(1,  noticia.getDescricaoNoticia());
			pst.setString(2,  noticia.getTituloNoticia());
			pst.setString(3,  noticia.getTextoNoticia());
			pst.setInt(4, noticia.getIdNoticia());
			
			pst.execute();			
			
		} catch (SQLException ex){
			
			System.err.println("Não foi possívle manitpular a tabela NOTICIA!!");
			ex.printStackTrace();
		}
	}
	
	
	//EXCLUINDO NOTICIA CADASTRADA N BANCO DE DADOS
	public void excluir (Noticia noticia) {
		
		String inserir = "DELETE FROM noticia WHERE id = ?";
		
		try( PreparedStatement pst = conexao.prepareStatement(inserir)){
			
			pst.setInt(1, noticia.getIdNoticia());
			
			pst.execute();
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular a tabela NOTICIA!!");
			ex.printStackTrace();
		}
	}
	
	//CONSULTANDO UMA NOTICIA NO BANCO DE DADOS
	public Noticia consultar(int idNoticia) {
		
		String inserir = "SELECT * FROM noticia WHERE id = ? ";
		
		try (PreparedStatement pst = conexao.prepareStatement(inserir)){
			
			pst.setInt(1, idNoticia);
			ResultSet resultado = pst.executeQuery();
			
			Noticia n = null;
			
			if (resultado.next()) {
				n = new Noticia();
				n.setIdNoticia(idNoticia);
				n.setDescricaoNoticia(resultado.getString("descricao"));
				n.setTituloNoticia(resultado.getString("titulo"));
				n.setTextoNoticia(resultado.getString("texto"));
			}
			
			return n;
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular a tabela NOTICIA!!");
			ex.printStackTrace();
			
			return null;			
		}
	}
	
	//LISTANDO TODAS AS NOTICIAS DO BANCO DE DADOS
	public ArrayList<Noticia> listarNoticias() {
		
		String inserir = "SELECT * FROM noticia";
		
		try(PreparedStatement pst = conexao.prepareStatement(inserir)){
			
			ResultSet resultado = pst.executeQuery();
			
			ArrayList<Noticia> lista = new ArrayList<>();
			while(resultado.next()) {
				Noticia n = new Noticia();
				n.setIdNoticia(resultado.getInt("id"));
				n.setDescricaoNoticia(resultado.getString("descricao"));
				n.setTituloNoticia(resultado.getString("titulo"));
				n.setTextoNoticia(resultado.getString("texto"));
				lista.add(n);
			}
			return lista;
		} catch (SQLException ex) {
			
			System.err.println("Não foin possível manipular a tabela NOTICIA!!");
			ex.printStackTrace();
			
			return null;
		}
	}
}
