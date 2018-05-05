package org.posJava.aula4;

public class Cd {

	private int 	id;
	private String 	artista;
	private String 	comentario;
	private boolean emprestado;
	private int    	nroMusicas;
	private int 	tempoDuracao;
	private String 	titulo;
	

	public Cd() {
	}


	public Cd(int id, String artista, String comentario, boolean emprestado, int nroMusicas, int tempoDuracao,
			String titulo) {
		this.id = id;
		this.artista = artista;
		this.comentario = comentario;
		this.emprestado = emprestado;
		this.nroMusicas = nroMusicas;
		this.tempoDuracao = tempoDuracao;
		this.titulo = titulo;
	}

	
	

	@Override
	public String toString() {
		return "Cd [id=" + id + ", artista=" + artista + ", comentario=" + comentario + ", emprestado=" + emprestado
				+ ", nroMusicas=" + nroMusicas + ", tempoDuracao=" + tempoDuracao + ", titulo=" + titulo + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public boolean isEmprestado() {
		return emprestado;
	}


	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}


	public int getNroMusicas() {
		return nroMusicas;
	}


	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}


	public int getTempoDuracao() {
		return tempoDuracao;
	}


	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

	
	
	
}
