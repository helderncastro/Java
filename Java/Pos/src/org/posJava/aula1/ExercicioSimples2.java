package org.posJava.aula1;

import java.util.Scanner;

public class ExercicioSimples2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2 ;
		
		System.out.println("Informe o primeiro número");
		numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número");
		numero2 = scan.nextInt();
		
		System.out.println("O resultado é " + (numero1 + numero2));
		
		scan.close();

	}

}
