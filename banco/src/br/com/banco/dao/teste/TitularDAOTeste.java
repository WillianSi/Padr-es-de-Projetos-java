package br.com.banco.dao.teste;

import java.sql.SQLException;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import br.com.banco.dao.TitularDAO;
import br.com.banco.domain.Titular;

class TitularDAOTeste {

	@Ignore
	void listar() {
		TitularDAO titularDAO = new TitularDAO();
		List<Titular> titulares = null;
		try {
			titulares = titularDAO.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Titular titular : titulares) {
			System.out.println("NOME: " + titular.getTitular());
		}
	}
	
	@Ignore
	void inserir() {
		Titular titular = new Titular();
		titular.setTitular("Caio");
		titular.setCidade("Salvador");
		titular.setSexo('M');
		
		TitularDAO titularDAO = new TitularDAO();
		try {
			if(titularDAO.inserir(titular))
				System.out.println("Registro inserido com sucesso!");
			else
				System.out.println("Falha ao temtar inserir o registro!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Ignore
	void editar() {
		Titular titular = new Titular();
		titular.setId(3);
		titular.setTitular("Carlito");
		titular.setCidade("NOVA SERRA");
		titular.setSexo('M');
		
		TitularDAO titularDAO = new TitularDAO();
		try {
			if(titularDAO.editar(titular))
				System.out.println("Registro editado com sucesso!");
			else
				System.out.println("Falha ao temtar editar o registro!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void excluir() {
		
		TitularDAO titularDAO = new TitularDAO();
		try {
			if(titularDAO.excluir(8))
				System.out.println("Registro EXCLUÍDO com sucesso!");
			else
				System.out.println("Falha ao temtar EXCLUIR o registro!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
