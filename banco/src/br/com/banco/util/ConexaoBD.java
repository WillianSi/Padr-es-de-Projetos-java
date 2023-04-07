package br.com.banco.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static boolean driverCarregado = false;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver do banco de dados carregado!");
			driverCarregado = true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private final static String url = "jdbc:mysql://localhost/banco";
	private final static String user = "root";
	private final static String password = "2bF83Jz@7";
	
	public static Connection getConnection() throws SQLException {
		Connection conexao = null;
		if (driverCarregado) {
			conexao = DriverManager.getConnection(url,user, password);
			System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
		}
		return conexao;
	}
	public static void closeConnection(Connection conexao) throws SQLException {
		if(conexao != null) {
			conexao.close();
			System.out.println("Conexão com o banco de dados encerrada com sucesso!");
		}
	}
}
