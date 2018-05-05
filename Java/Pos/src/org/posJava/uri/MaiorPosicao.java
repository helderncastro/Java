package org.posJava.uri;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		int[] entrada = new int[100];
		Scanner scan = new Scanner(System.in);
		int maior = 0;
		int posicao = 0;
		
		for(int x=0;x<100;x++) {
			entrada[x] = Integer.parseInt(scan.nextLine());	
		}
		
		scan.close();
		
		for(int x=0;x<100;x++) {
			if (maior < entrada[x]) {
				maior = entrada[x];
				posicao = ++x;
			}
		}
		
		System.out.println("Maior: " + maior + " Posição: " + posicao );		
		

	}

}
