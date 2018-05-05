package org.posJava.aula4;

public class Video {

	private int 	id;
	private String 	comentario;
	private String 	diretor;
	private boolean emprestado;
	private int	tempoDuracao;
	private String 	titulo;
	
	public Video() {
	}

	public Video(int id, String comentario, String diretor, boolean emprestado, int tempoDuracao, String titulo) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.diretor = diretor;
		this.emprestado = emprestado;
		this.tempoDuracao = tempoDuracao;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", comentario=" + comentario + ", diretor=" + diretor + ", emprestado=" + emprestado
				+ ", tempoDuracao=" + tempoDuracao + ", titulo=" + titulo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	
	
}
