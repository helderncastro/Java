package org.posJava.uri;

import java.util.Scanner;

public class HoHoHo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros = 0;
		String hohoho = "";
		
		System.out.print("Informe a qtde de hohohos:");
		numeros = Integer.parseInt(scan.nextLine());
		for (int x = 0; x<numeros;x++){
			hohoho += "ho ";
		}
		
		System.out.println(hohoho+ "!");

		scan.close();
	}

}
