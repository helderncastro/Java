package org.posJava.uri;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Informe a quantidade de termos");
		int iteracoes = Integer.parseInt(scan.nextLine());
		int numero=1, resultado=1;
		for (int x=0;x<=iteracoes;x++){
			numero = (numero * -1);
			resultado = resultado + numero;
		}
		
		System.out.println("Resultado é " + resultado);
		
		scan.close();

		
	}

}
