package org.posJava.aula4.polimorfismo;

public class PessoaFisica extends Pessoa{
	
	String cpf;
	
	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public boolean validade() {
		// TODO Auto-generated method stub
		if (this.cpf.length() == 11) {
			return true;	
		} else 
			return false;
		
	}

}
