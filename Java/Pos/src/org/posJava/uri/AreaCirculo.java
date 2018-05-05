package org.posJava.uri;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio;
		double a;
		
		raio = Double.parseDouble(scan.nextLine());
		a = 3.14159 * Math.pow(raio, 2);
		System.out.printf("A= %.4f%n",a);
		scan.close();
		
	}
	
	
}
