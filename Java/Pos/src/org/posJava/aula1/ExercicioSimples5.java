package org.posJava.aula1;

import java.util.Scanner;

public class ExercicioSimples5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fat;
		
		System.out.println("Informe o número para exibir o fatorial");
		fat = Integer.parseInt(scan.nextLine());
		
		System.out.println(fatorial(fat));
		
		scan.close();
	}

	public static int fatorial(int numero) {
		if (numero == 1) {
			return 1;
		} 
		
		return (numero * fatorial(numero-1)); 
	}
	
}
