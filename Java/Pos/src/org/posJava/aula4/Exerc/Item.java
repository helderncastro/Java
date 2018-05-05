package org.posJava.aula4.Exerc;

public abstract class Item {

	private int 	id;
	private String 	comentario;
	private boolean emprestado;
	private int		tempoDuracao;
	private String 	titulo;
	
	public Item() {	}

	public Item(int id, String comentario, boolean emprestado, int tempoDuracao, String titulo) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.emprestado = emprestado;
		this.tempoDuracao = tempoDuracao;
		this.titulo = titulo;
	}



	@Override
	public String toString() {
		return " id= " + id + ", Comentário= " + comentario + ", emprestado= " + emprestado + ", Duração= "
				+ tempoDuracao + ", título=" + titulo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + (emprestado ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + tempoDuracao;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}


	// getters e setters.
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
	
	
}
