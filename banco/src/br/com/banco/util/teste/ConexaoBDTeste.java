package br.com.banco.util.teste;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import br.com.banco.util.ConexaoBD;

class ConexaoBDTeste {

	@Test
	void test() throws SQLException {
		Connection conexao = ConexaoBD.getConnection();
		ConexaoBD.closeConnection(conexao);
	}
}
