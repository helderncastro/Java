package org.posJava.apis;

public class Produto {
	private String nome;
	private int id;
	private int preco;
	
	public Produto() {
	}
	
	public Produto(String nome, int id, int preco) {
		super();
		this.nome = nome;
		this.id = id;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", id=" + id + ", preco=" + preco + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	

}
