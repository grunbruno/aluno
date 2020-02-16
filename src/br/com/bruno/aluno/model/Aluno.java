package br.com.bruno.aluno.model;

public class Aluno {
	private int id;
	private String nome;
	private String cpf;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){
		return this.id+" - "+ this.nome+" - " + this.cpf;
	}
	
	
}
