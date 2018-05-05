package org.posJava.uri;

import java.util.Scanner;

public class NumerosPositivos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] entradas = new double[6];
		
		entradas[0] = Double.parseDouble(scan.nextLine());
		entradas[1] = Double.parseDouble(scan.nextLine());
		entradas[2] = Double.parseDouble(scan.nextLine());
		entradas[3] = Double.parseDouble(scan.nextLine());
		entradas[4] = Double.parseDouble(scan.nextLine());
		entradas[5] = Double.parseDouble(scan.nextLine());
		scan.close();
		
		int conta = 0;
		
		for(int x=0; x<5;x++) {
			if(entradas[x]>0) {
				conta++;
			}
		}
		
		System.out.println("Números positivos " + conta);
		
		
	}
}
