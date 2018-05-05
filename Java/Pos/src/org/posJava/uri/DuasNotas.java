package org.posJava.uri;
import java.util.Scanner;

public class DuasNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre a qtde de números");
		int iteracoes = Integer.parseInt(scan.nextLine());
		int troco = 0;
		int[][] listaNumeros = new int[iteracoes][2];

		for(int x=0;x<iteracoes;x++) {
			System.out.println("Entre com o valor da compra");
			listaNumeros[x][0] = Integer.parseInt(scan.nextLine());
			System.out.println("Entre com o valor da pago");
			listaNumeros[x][1] = Integer.parseInt(scan.nextLine());			
		}

		for(int x=0;x<iteracoes;x++) {
			troco = listaNumeros[x][1] - listaNumeros[x][0];

			if ((listaNumeros[x][0] == 0) || (listaNumeros[x][1])==0) {
				System.out.println("Não é possível");
			} else 	if (ePossivel(troco)) {
				System.out.println("É possível");
			} else {
				System.out.println("Não é possível");
			}

		}

		scan.close();

	}

	public static boolean ePossivel(int troco){

		if ((troco == 1) || (troco == 3)){
			return false;
		} else if (troco > 100) {
			ePossivel(troco - 100);
		} else if (troco > 50) {
			ePossivel(troco - 50);
		} else if (troco > 20) {
			ePossivel(troco - 20);
		} else if (troco > 10) {
			ePossivel(troco - 10);
		} else if (troco > 5) {
			ePossivel(troco - 5);
		} else if (troco > 2) {
			ePossivel (troco - 2);
		} else if (troco == 0) {
			return true;
		}
		return false;
	}


}
