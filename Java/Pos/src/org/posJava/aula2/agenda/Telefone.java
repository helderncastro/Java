package org.posJava.aula2.agenda;

public class Telefone {

	private String tipo;
	private int numero;

	public Telefone() {
	}

	public Telefone(String tipo, int numero) {
		this.tipo = tipo;
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "[tipo=" + tipo + ", numero=" + numero + "]";
	}

}
