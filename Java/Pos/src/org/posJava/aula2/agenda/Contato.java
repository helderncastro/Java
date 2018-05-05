package org.posJava.aula2.agenda;

import java.util.LinkedList;
import java.util.List;

public class Contato {

	private int id;
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones = new LinkedList<>();

	public Contato() {
	}

	public Contato(int id, String nome, Endereco endereco, List<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void addTelefone(Telefone telefone) {
		telefones.add(telefone);
	}

	public void delTelefone(int numero) {
		for (Telefone telefone : telefones) {
			if (telefone.getNumero() == numero) {
				telefones.remove(numero);
			}
		}
	}

	public void delTelefoneByIndex(int index) {
		telefones.remove(index);
	}

	public void mostra() {
		System.out.println(
				"Contato [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefones=" + telefones + "]");
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefones=" + telefones + "]";
	}

}
