package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Comentario;


public class ComentarioDAO extends NoticiaDAO{
	
	//atributo de conexao
	private Connection conexao;
	
	//construtor
	public ComentarioDAO(){
		this.conexao = ConnectionFactory.conectar();
	}
	
	//CADASTRANDO UM COMENTÁRIO NA NoTICIA
		public void cadastrar(Comentario com) {
			
			String inserir = "INSERT INTO comentario "
					+ "(nome, texto, fk_noticia_id) "
					+ "VALUES(?, ?, ?)";
			
			try(PreparedStatement pst = conexao.prepareStatement(inserir)){
				
//				pst.setInt(1, com.getIdComentario());
				pst.setString(1, com.getNomeComentario());
				pst.setString(2, com.getTextoComentario());
				pst.setInt(3,  com.getIdNoticia());
				
				pst.execute();
				
				
			} catch (SQLException ex) {
				
				System.err.println("Não foi possível manipular a tabela COMENTÁRIO!!!");
				ex.printStackTrace();
			}
		}
		
		//ALETRANDO UM COMENTARIO
//		public void alterar (Comentario com) {
//			
//			String inserir = "UPDATE comentario SET nome = ?, " + 
//			"texto = ? WHERE fk_noticia_id  = ?" /*AND id = ?*/;
//			
//			try (PreparedStatement pst = conexao.prepareStatement(inserir)) {
//				
////				pst.setInt(1, com.getIdComentario());
//				pst.setString(1, com.getNomeComentario());
//				pst.setString(2, com.getTextoComentario());
//				pst.setInt(3, com.getIdNoticia());
//				
//				pst.execute();
//				
//			} catch (SQLException ex){
//				
//				System.err.println("Não fo possível manipular a tabela COMEMTÁRIO!!!");
//				ex.printStackTrace();			
//			}
//		}
//		
		//EXCLUINDO UM COMENTARIO
//		public void excluir (Comentario com ) {
//			
//			String inserir = "DELETE FROM comentario WHERE id = ?"+
//			" AND fk_noticia_id = ?";
//			
//			try (PreparedStatement pst = conexao.prepareStatement(inserir)){
//				
//				pst.setInt(1, com.getIdComentario());
//				pst.setInt(2, com.getIdNoticia());
//				
//				pst.execute();
//				
//			} catch(SQLException ex) {
//				
//				System.err.println("Não foi possível manipular a tablea COMENTÁRIO!!!");
//				ex.printStackTrace();				
//			}
//		}
//		
		//CONSULTANDO UM COMENTARIO
//		public Comentario consultar(int idComentario, int idNoticia) {
//			
//			String inserir = "SELECT * FROM comentario WHERE id = ?" 
//					+" AND fk_noticia_id ?";
//			
//			try (PreparedStatement pst = conexao.prepareStatement(inserir)){
//				
//				pst.setInt(1, idComentario);
//				pst.setInt(2, idNoticia);
//				ResultSet resultado = pst.executeQuery();
//				
//				Comentario c = null;
//				
//				if (resultado.next()) {
//					
//					c = new Comentario();
//					c.setIdComentario(idComentario);
//					c.setNomeComentario(resultado.getString("nome"));
//					c.setTextoComentario(resultado.getString("texto"));
//					c.setIdNoticia(idNoticia);
//				}
//				return c;
//			} catch (SQLException ex) {
//				
//				System.err.println("Não Foi possível Manipular a tabela COMENTÁRIO!!!");
//				ex.printStackTrace();
//				return null;
//			}
//		}
		
		//LISTANDO TODOS OS COMETÁRIOS
		public ArrayList<Comentario> listarComentario(){
			
			String inserir = "SELECT * FROM comentario";
			
			try (PreparedStatement pst = conexao.prepareStatement(inserir)) {
				
				ResultSet resultado = pst.executeQuery();
				
				ArrayList<Comentario> lista = new ArrayList<>();
				
				while(resultado.next()) {
					
					Comentario c = new Comentario();
//					c.setIdComentario(resultado.getInt("id"));
					c.setNomeComentario(resultado.getString("nome"));
					c.setTextoComentario(resultado.getString("texto"));
					c.setIdNoticia(resultado.getInt("fk_noticia_id"));
					lista.add(c);
				}
				return lista;
			} catch (SQLException ex) {
				
				System.err.println("Não Foi possível Manipular a tabela COMENTÁRIO!!!");
				ex.printStackTrace();
				return null;
			}		
		}
		
}
