package br.com.bruno.aluno.testes;


import java.sql.Connection;
import java.util.List;

import br.com.bruno.aluno.connection.ConnectionFactory;
import br.com.bruno.aluno.dao.AlunoDAO;
import br.com.bruno.aluno.model.Aluno;

public class TestaConexao {
	public static void main(String[] args) {
					
		/*	
		Aluno b  = new Aluno();
		b.setNome("GIOVANNA A. ROSSI");
		b.setCpf("325.536.018-83");
		
		Connection connection = new ConnectionFactory().obterConexao();
		AlunoDAO adao = new AlunoDAO(connection);
		
		adao.save(b);
		*/
		
		Connection connection = new ConnectionFactory().obterConexao();
		AlunoDAO adao = new AlunoDAO(connection);
		List<Aluno> alunos = adao.lista();
		
		for(Aluno cadaAluno: alunos){
			System.out.println(cadaAluno.toString());
		}
		
		
		
		
		
	}
}
