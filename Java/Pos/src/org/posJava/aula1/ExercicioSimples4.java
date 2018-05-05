package org.posJava.aula1;

import java.util.Scanner;

public class ExercicioSimples4 {
	
	public static void main( String args[]) {
		
		int numero = 0, contador = 0;
		String resp;
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		do {
			System.out.println("Informe a nota do aluno");
			numero += Integer.parseInt(scan.nextLine());
			contador++;
			
			System.out.println("Deseja exibir a média (S/N)");
			resp = scan.nextLine();
			
			if (resp.equalsIgnoreCase("S")) {
				sair = true;
			}
		} while (sair == false);
		
		System.out.println("O resultado é :" + (numero/contador));
		
		scan.close();
	}

	
}

