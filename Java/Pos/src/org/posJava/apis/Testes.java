package org.posJava.apis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Testes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		List lista = new ArrayList();
		lista.add("aluno 1");
		lista.add("aluno 2");
		lista.add("aluno 3");
		lista.add("aluno 4");
		System.out.println(lista);
		
		lista.add(0,"Aluno 5");
		System.out.println(lista);
		*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		 
		Aluno a1 = new Aluno("Zezin",1l);
		Aluno a2 = new Aluno("Maria",2l);
		
		alunos.add(a1);
		alunos.add(a2);
		
		System.out.println(alunos);

 		alunos.sort( new Comparator<Aluno>() {

			@Override
			public int compare(Aluno a1, Aluno a2) {
				// TODO Auto-generated method stub
				return a1.getNome().compareTo(a2.getNome());
			}
 			
 		});
 		
 		
 		System.out.println(alunos);
 	
 		
	}
	
	
}
