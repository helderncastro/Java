package org.posJava.aula4.polimorfismo;

public class PessoaJuridica extends Pessoa{

	String cnpj;
		
	public PessoaJuridica(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public boolean validade() {
		if (this.cnpj.length() == 14) {
			return true;	
		} else 
			return false;
		
		
	}

}
