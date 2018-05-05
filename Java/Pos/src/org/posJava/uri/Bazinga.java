package org.posJava.uri;

import java.util.Scanner;

public class Bazinga {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;

		System.out.print("Informe a qtde de entradas:");	
		numero = Integer.parseInt(scan.nextLine());
		String[][] entradas = new String[numero][2]; 
		for (int x = 0; x<numero;x++){
			System.out.println("Escolha entre PEDRA/PAPEL/TESOURA/LAGARTO/SPOCK");
			System.out.println("informe a entrada do Raj");
			entradas[x][0] = scan.nextLine();
			System.out.println("informe a entrada do Sheldon");
			entradas[x][1] = scan.nextLine();							

		}

		for (int x=0;x<numero;x++) {

			// tesoura  -	a tesoura corta o papel  a tesoura decapita o lagarto;===================================================================
			
			if (entradas[x][0].equalsIgnoreCase("tesoura")) {
				if ((entradas[x][1].equalsIgnoreCase("papel")) || (entradas[x][1].equalsIgnoreCase("lagarto"))){
					System.out.println("Raj trapaceou");			
				} else if (entradas[x][1].equalsIgnoreCase("tesoura")){
					System.out.println("De novo");
				} else {
					System.out.println("Bazinga");
				}
			}
			// Papel - o papel embrulha a pedra; o papel contesta Spock; ===========================================================================
			
			if (entradas[x][0].equalsIgnoreCase("papel")) {
				if ((entradas[x][1].equalsIgnoreCase("pedra")) || (entradas[x][1].equalsIgnoreCase("spock"))){
					System.out.println("Raj trapaceou");			
				} else if (entradas[x][1].equalsIgnoreCase("papel")){
					System.out.println("De novo");
				} else {
					System.out.println("Bazinga");
				}
			}
			// Pedra - a pedra esmaga o lagarto; a pedra quebra a tesoura. ===========================================================================
			
			if (entradas[x][0].equalsIgnoreCase("pedra")) {
				if ((entradas[x][1].equalsIgnoreCase("lagarto")) || (entradas[x][1].equalsIgnoreCase("tesoura"))){
					System.out.println("Raj trapaceou");			
				} else if (entradas[x][1].equalsIgnoreCase("pedra")){
					System.out.println("De novo");
				} else {
					System.out.println("Bazinga");
				}
			}
			// Lagarto - o lagarto envenena Spock; o lagarto come o papel ===========================================================================
			
			if (entradas[x][0].equalsIgnoreCase("lagarto")) {
				if ((entradas[x][1].equalsIgnoreCase("spock")) || (entradas[x][1].equalsIgnoreCase("papel"))){
					System.out.println("Raj trapaceou");			
				} else if (entradas[x][1].equalsIgnoreCase("lagarto")){
					System.out.println("De novo");
				} else {
					System.out.println("Bazinga");
				}
			}
			// Spock - Spock destrói a tesoura; Spock vaporiza a pedra ===========================================================================
			
			if (entradas[x][0].equalsIgnoreCase("spock")) {
				if ((entradas[x][1].equalsIgnoreCase("tesoura")) || (entradas[x][1].equalsIgnoreCase("pedra"))){
					System.out.println("Raj trapaceou");			
				} else if (entradas[x][1].equalsIgnoreCase("spock")){
					System.out.println("De novo");
				} else {
					System.out.println("Bazinga");
				}
			}

		}

	
		scan.close();
	}



}
