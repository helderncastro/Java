package org.posJava.aula1;

import java.util.Scanner;

public class ExercicioSimples3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		String operacao;
		
		System.out.println("favor entrar com o primeiro número:");
		num1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("favor entrar com o segundo número:");
		num2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Favor informar a operação aritimética (+ ou -) ");
		operacao = scan.nextLine();
		
		if (operacao.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		} else if (operacao.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		} else
		{
			System.out.println("Entrada incorreta");
		}
		
		scan.close();
	}

}
