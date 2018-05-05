package org.posJava.uri;

import java.util.Scanner;

public class Patinhos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Informe a quantidade de patinhos");
			numero = Integer.parseInt(scan.nextLine());
			if (numero != -1) {
				System.out.println((numero - 1 ) +" patinhos Voltaram de lá");	
			}
			
		} while (numero != -1);
			
		scan.close();		
		
	}

}
