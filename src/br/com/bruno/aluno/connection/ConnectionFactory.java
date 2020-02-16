package br.com.bruno.aluno.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;


public class ConnectionFactory {
		
	public Connection obterConexao(){
		try {
			
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bruno?useTimezone=true&serverTimezone=UTC","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException( "Erro ao conectar ao banco de dados MYSQL!");
		}
		
	}
}

