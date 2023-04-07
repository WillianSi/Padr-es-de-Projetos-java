package br.com.banco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.banco.domain.Titular;
import br.com.banco.util.ConexaoBD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TitularDAO {
	public ObservableList<Titular> listar() throws SQLException{
		
		ObservableList<Titular> lista = FXCollections.observableArrayList();
	
		String sql = "SELECT * FROM titulares";
		
		Connection conexao;
		
			conexao = ConexaoBD.getConnection();
			PreparedStatement psmt = conexao.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Titular titular = new Titular();
				
				titular.setId(rs.getInt("id"));
				titular.setTitular(rs.getString("nome"));
				titular.setCidade(rs.getString("cidade"));
				titular.setSexo(rs.getString("sexo").charAt(0));
				lista.add(titular);
			}
			psmt.close();
			ConexaoBD.closeConnection(conexao);
			
		return lista;
	}
	
	//---------------------------------------------------------------------------
	
	public Boolean inserir(Titular titular) throws SQLException{
		
		boolean resultado = false;
	
		String sql = "INSERT INTO titulares (nome, cidade, sexo) VALUES(?,?,?)";
		
		Connection conexao;
			conexao = ConexaoBD.getConnection();
			PreparedStatement psmt = conexao.prepareStatement(sql);
			psmt.setString(1, titular.getTitular());
			psmt.setString(2, titular.getCidade());
			psmt.setString(3, String.valueOf(titular.getSexo()));
			
			if (psmt.executeUpdate() > 0) {
				resultado = true;
			}
			psmt.close();
			ConexaoBD.closeConnection(conexao);
			
		return resultado;
	}
	
	//---------------------------------------------------------------------------
	public Boolean editar(Titular titular) throws SQLException{
			
			boolean resultado = false;
		
			String sql = "UPDATE titulares SET nome = ?, cidade = ?, sexo = ? WHERE id = ?";
			
			Connection conexao;
				conexao = ConexaoBD.getConnection();
				PreparedStatement psmt = conexao.prepareStatement(sql);
				psmt.setString(1, titular.getTitular());
				psmt.setString(2, titular.getCidade());
				psmt.setString(3, String.valueOf(titular.getSexo()));
				psmt.setInt(4, titular.getId());
				
				if (psmt.executeUpdate() > 0) {
					resultado = true;
				}
				psmt.close();
				ConexaoBD.closeConnection(conexao);
	
			return resultado;
		}
	//---------------------------------------------------------------------------
	public Boolean excluir(int id) throws SQLException{
		
		boolean resultado = false;
	
		String sql = "DELETE FROM titulares WHERE id = ?";
		
		Connection conexao;
		
			conexao = ConexaoBD.getConnection();
			PreparedStatement psmt = conexao.prepareStatement(sql);
			psmt.setInt(1, id);
			
			if (psmt.executeUpdate() > 0) {
				resultado = true;
			}
			psmt.close();
			ConexaoBD.closeConnection(conexao);
			
		return resultado;
	}
}
