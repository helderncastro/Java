package org.posJava.uri;

import java.util.Scanner;

public class RestoDivisao {

	public static void main(String[] args) {
		int x,y, maior,menor;
		maior = menor = 0;
		Scanner scan = new Scanner(System.in);
		
		x = Integer.parseInt(scan.nextLine());
		y = Integer.parseInt(scan.nextLine());
		
		if(x<y) {
			maior = y;
			menor = x;
		} else if(x>y) {			
			maior = x;
			menor = y;
		}
		
		++menor;
		for(int i=menor;i<maior;i++) {
			if ((i % 5 == 2) || (i % 5 == 3)) {
				System.out.println(i);
			}
		}
		
		scan.close();

	}

}
