package org.posJava.aula4.polimorfismo;

public class Testes {

	public static void main(String[] args) {
		
		Pessoa p1 = new PessoaFisica("11122233344");
		Pessoa p2 = new PessoaJuridica("10189882000139");
		
		System.out.println(p1.validade());
		System.out.println(p2.validade());

		
		
	}

}
