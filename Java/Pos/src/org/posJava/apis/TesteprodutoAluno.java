package org.posJava.apis;

import java.util.ArrayList;

public class TesteprodutoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		produtos.add(new Produto("Cerveja", 1, 5));
		produtos.add(new Produto("Suco", 2, 3));
		
		clientes.add(new Cliente(1,"Joaquim",17));
		clientes.add(new Cliente(2,"Joaquim",18));
		clientes.add(new Cliente(3,"Joaquim",19));
		clientes.add(new Cliente(4,"Joaquim",21));
		clientes.add(new Cliente(5,"Joaquim",22));
		clientes.add(new Cliente(6,"Joaquim",23));
		
		/*
		// cerveja 
		System.out.println(comprar(p1,c1));
		System.out.println(comprar(p1,c2));
		System.out.println(comprar(p1,c3));
		System.out.println(comprar(p1,c4));
		System.out.println(comprar(p1,c5));
		System.out.println(comprar(p1,c6));
	
		// suco
		System.out.println("Suco-------------------------");
		System.out.println(comprar(p2,c1));
		System.out.println(comprar(p2,c2));
		System.out.println(comprar(p2,c3));
		System.out.println(comprar(p2,c4));
		System.out.println(comprar(p2,c5));
		System.out.println(comprar(p2,c6));		
		*/
		
	}
	
	public static String comprar(Produto p, Cliente c) {
	
		if (c.getIdade() < 18) {
			return "Proibida a Venda - Menor de Idade";
		}
		
		if ((c.getIdade() < 21) && (p.getNome().equalsIgnoreCase("Cerveja") ) ) {
			return "Proibida a Venda - Menor de 21 para Cerveja";
		}
		
		return "Venda Permitida";
	}
	

}
