package org.posJava.uri;

import java.util.Scanner;

public class VitoriaIndecisa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a qtde de iterações");
		int i = Integer.parseInt(scan.nextLine());
		String[] s = new String[i];
		
		for (int x=0;x<i;x++){
			System.out.println("Informe o curso");
			s[x] = scan.nextLine();			
		}
		scan.close();
		System.out.println("Deve fazer Ciencia da Computação");
	}

}
