package br.com.bruno.aluno.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bruno.aluno.model.Aluno;


public class AlunoDAO {
	private Connection connection;
	
	public AlunoDAO(Connection connection){
		this.connection = connection;
	}
	
	public void save(Aluno aluno){
		
		String sql = "insert into aluno (nome,cpf) values(?,?)";
		try {
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getCpf());
			ps.execute();
			ps.close();
			this.connection.close();
			System.out.println("Aluno gravado!!!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Aluno> lista(){
		
		List<Aluno> alunos = new ArrayList<>();
		
		String sql = "select * from aluno";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Aluno a = new Aluno();
				a.setId(rs.getInt("id"));
				a.setCpf(rs.getString("cpf"));
				a.setNome(rs.getString("nome"));
			
				alunos.add(a);
			
			}
			return alunos;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Erro ao gravar aluno!");
		}
	}
}
