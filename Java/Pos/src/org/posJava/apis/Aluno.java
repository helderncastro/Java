package org.posJava.apis;

public class Aluno {

	private String nome;
	private long matricula;
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public Aluno() {
		
	}
	
	public Aluno(String nome, long matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	
}
