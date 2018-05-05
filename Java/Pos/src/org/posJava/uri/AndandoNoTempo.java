package org.posJava.uri;

import java.util.Scanner;

public class AndandoNoTempo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.println("Entre com o primeiro número: ");
		numero1 = Integer.parseInt(scan.nextLine());
		System.out.println("Entre com o segundo número: ");
		numero2 = Integer.parseInt(scan.nextLine());
		System.out.println("Entre com o terceiro número: ");
		numero3 = Integer.parseInt(scan.nextLine());
		
		if ((numero1 == numero2) || (numero2 == numero3) || (numero1 == numero3) ) {
			System.out.println("É possível");
		} else {
			if ( ((numero1 + numero2) == numero3) || ((numero2 + numero3) == numero1) || ((numero1 + numero3) == numero2) ) {
				System.out.println("É possível");
			} else {
				System.out.println("não é possível");
			}
			
		}
			
		scan.close();

	}
	


}
