package org.posJava.aula2.agenda;

public class Endereco {

	private String logradouro;
	private int numero;
	private String complemento;
	private int cep;

	public Endereco() {
	}

	public Endereco(String logradouro, int numero, String complemento, int cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return " [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep
				+ "]";
	}

}
