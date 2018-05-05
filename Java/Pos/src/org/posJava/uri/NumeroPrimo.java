package org.posJava.uri;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		int numeroEntradas;
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Informe a quantidade de entradas para números primos");
		numeroEntradas = Integer.parseInt(scan.nextLine());
		int[] numeros = new int[numeroEntradas];
		for (int i=0; i<=(numeroEntradas-1);i++) {
			System.out.println("Entre o número");
			numeros[i] = Integer.parseInt(scan.nextLine());
		}
		
		for (int i=0; i<=(numeroEntradas-1);i++) {
			int x = numeros[i] - 1;
			ePrimo(x, numeros[i]);
		}
		
		scan.close();
	}
	
	public static void ePrimo(int numero, int original) {
		if (numero == 1) {
			System.out.println(original + " É número primo");
			return;
		} 
		
		if (original % numero == 0) {
			System.out.println(original + " Não é primo");
			return;				
		} else {
			 ePrimo(--numero,original);	
			}
		}
			
		
	}
	
	
