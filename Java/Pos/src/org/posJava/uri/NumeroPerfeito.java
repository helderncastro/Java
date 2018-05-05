package org.posJava.uri;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int qtdeNumeros=0;
		
		System.out.println("Por favor informe a quantidade de números");
		qtdeNumeros = Integer.parseInt(scan.nextLine());
		int[] numeros = new int[qtdeNumeros];
		
		for (int x=0; x< qtdeNumeros; x++){
			System.out.print("Informe o número:");
			numeros[x] = Integer.parseInt(scan.nextLine());
		}
		
		for (int x=0; x< qtdeNumeros;x++) {
			numPerfeito(numeros[x]);
		}
		
		scan.close();
	}

	
	public static void numPerfeito(int numero){
		int somaNumero=0;
		for (int x=1; x<(numero-1);x++){
			if(numero % x == 0) {
				somaNumero += x;
			}
		}
		
		if (somaNumero == numero) {
			System.out.println(numero +  " é um número perfeito");			
		} else {
			System.out.println(numero + " não é um número perfeito");
		}
			
		
		
	}
}
