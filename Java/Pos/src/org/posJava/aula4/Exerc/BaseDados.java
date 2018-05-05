package org.posJava.aula4.Exerc;

import java.util.ArrayList;
import java.util.List;

public class BaseDados {

	private List<Item> listaItens = new ArrayList<>();
	

	// construtores -----------------------------------------------------------------
	public BaseDados() {
		// TODO Auto-generated constructor stub
	}
	public BaseDados(List<Item> listaItens) {
		super();
		this.listaItens = listaItens;
	}

	// metódos ----------------------------------------------------------------------
	
	public void inserirItem(Item item) {
		listaItens.add(item);		
	}
	
	
	public void apagarItem(int idItem) {
		for(int i=0;i<listaItens.size(); i++) {
			if(listaItens.get(i).getId() == idItem) {
				listaItens.remove(i);
				i--; // voltar o índice porque a lista é reindexada quando o ítem for apagado.
			}
		}
	}

	public void listarItens() {
		for(Item item: listaItens){
			System.out.println(item.toString());
		}
	}
	
	public void atualizarItem(int idItem, Item item) {
		for (int i=0;i<listaItens.size();i++){
			if(listaItens.get(i).getId() == idItem){
				listaItens.set(i, item);
			}
		}
	}
	
	
	// get e Set ---------------------------------------------------------------------
	public List<Item> getListaItens() {
		return listaItens;
	}


	public void setListaItens(List<Item> listaItens) {
		this.listaItens = listaItens;
	}

	
	
}
