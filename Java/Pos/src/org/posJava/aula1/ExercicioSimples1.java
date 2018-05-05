
package org.posJava.aula1;

import java.util.Scanner;

public class ExercicioSimples1 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String nome1, nome2;

		
		System.out.println("Entre com o primeiro nome");
		nome1 = scan.nextLine();
		
		System.out.println("Entre com o segundo nome");
		nome2 = scan.nextLine();
		
		System.out.println("nome 1 :" + nome1);
		System.out.println("nome 2 :" + nome2);
		
		scan.close();
		
	}
	
}
