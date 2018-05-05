package org.posJava.aula4.Exerc;

public class Video extends Item {

	private String 	diretor;
	
	// construtores ----------------------------------------------------------
	public Video() {
		// TODO Auto-generated constructor stub
	}
	
	public Video(String diretor) {
		super();
		this.diretor = diretor;
	}

	// to string ----------------------------------------------------------------
	@Override
	public String toString() {
		return "Video - " + super.toString() + ", diretor= " + diretor ;
	}
	
	// getters e setters -------------------------------------------------------
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}


}
