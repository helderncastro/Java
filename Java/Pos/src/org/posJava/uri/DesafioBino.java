package org.posJava.uri;

import java.util.Scanner;
/*
 * Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 
 * 4 Multiplo(s) de 2
 * 0 Multiplo(s) de 3
 * 2 Multiplo(s) de 4
 * 3 Multiplo(s) de 5
 */


public class DesafioBino {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre a qtde de números");
		int iteracoes = Integer.parseInt(scan.nextLine());
		int mult2=0, mult3=0, mult4=0, mult5=0;
		
		int[] listaNumeros = new int[iteracoes];
		
		for(int x=0;x<iteracoes;x++) {
			System.out.println("Entre com o número");
			listaNumeros[x] = Integer.parseInt(scan.nextLine());			
		}
	
		for(int x=0;x<iteracoes;x++) {
			if (multiplo(listaNumeros[x],2)){
				mult2++;
			}
			if (multiplo(listaNumeros[x],3)){
				mult3++;
			}			
			if (multiplo(listaNumeros[x],4)){
				mult4++;
			}
			if (multiplo(listaNumeros[x],5)){
				mult5++;
			}
		}
		
		System.out.println( mult2 + " Multiplo(s) de 2 ");
		System.out.println( mult3 + " Multiplo(s) de 3 ");
		System.out.println( mult4 + " Multiplo(s) de 4 ");
		System.out.println( mult5 + " Multiplo(s) de 5 ");
			
		
		scan.close();
	}
	
	public static boolean multiplo(int numero, int multiplo) {
		
		if (numero % multiplo == 0) {
			return true;
		} 		
		return false;
	}

}
