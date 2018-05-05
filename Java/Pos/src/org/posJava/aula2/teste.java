package org.posJava.aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		// Programação Orientada a Objetos com Java. Uma Introdução Prática Usando o BlueJ (Português) Capa Comum – 26 nov 2008
		
		Scanner scan = new Scanner(System.in );
		ArrayList<Aluno> listAluno = new ArrayList<>();
		//ArrayList listAluno = new ArrayList(); utilizando um tipo de Objeto
		String resposta;
		boolean continuar = true;
		
		while (continuar){
			
			Aluno aluno = new Aluno();
			System.out.println("Favor entrar com os dados do Aluno ");
			System.out.println("Entre com o ID: ");
			aluno.setId(Integer.parseInt(scan.nextLine()));
			System.out.println("Entre com o nome: ");
			aluno.setNome(scan.nextLine());
			System.out.println("Entre com o Curso: ");
			aluno.setCurso(scan.nextLine());
			listAluno.add(aluno);
			
			System.out.println("Deseja Continuar(S/N)?");
			resposta = scan.nextLine();
			if (resposta.equals("n") || resposta.equals("N") )  {
				continuar = false;
			}	
			
		}
		
		// for (Object a: listAluno) { --- se for utilizando objeto
		for (Aluno a : listAluno) {
			System.out.println(a);
		}
		
		
		scan.close();

	}

}
