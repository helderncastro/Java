package org.posJava.aula2.agenda;

import java.util.LinkedList;
import java.util.List;

public class Agenda {

	private List<Contato> contatos = new LinkedList<>();

	public Agenda() {
	}

	public Agenda(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public void addContato(Contato contato) {
		contatos.add(contato);
	}

	public void delContatosById(int id) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getId() == id) {
				contatos.remove(i);
				i--;
				break;
			}
		}
	}

	public void delContatosByIndex(int index) {
		contatos.remove(index);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Contato getContatoByid(int id) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getId() == id) {
				return contatos.get(i);
			}
		}
		return null;
	}

	public Contato getContatoByName(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome() == nome) {
				return contatos.get(i);
			}
		}
		return null;
	}

	public void mostraContatos() {
		final int maxLen = 10;
		System.out.println("Agenda [contatos="
				+ (contatos != null ? contatos.subList(0, Math.min(contatos.size(), maxLen)) : null) + "]");
	}
}
