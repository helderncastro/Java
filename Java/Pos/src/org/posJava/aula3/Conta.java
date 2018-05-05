package org.posJava.aula3;

import java.math.BigDecimal;

public class Conta {

	private int numero;
	private Agencia agencia;
	private Cliente cliente;
	private String senha;
	private BigDecimal saldo;
	
	/* BigDecimal decimal1 = new BigDecimal("10");
	 if (decimal1.compareTo(decimal2) == -1 )  0 = igual 1 = maior
	  {   decimal 1 é menor	  }
	*/
	
/* contrutores ============================================================================*/
	public Conta() {
	}

	public Conta(int numero, Agencia agencia, Cliente cliente, String senha) {
		this.numero  = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.senha   = senha;
		this.saldo   = BigDecimal.ZERO;;
	}
	
	
	/* getters e setters =================================================================*/
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta: " + numero + ", saldo: " + saldo + "]";
	}
	
	
	/* metodos ===============================================================================*/
	
	public void sacar(BigDecimal valor) {
		if (valor.doubleValue() <= 0) {
			throw new RuntimeException("Valor não pode ser negativo ou Zero!");
		}		
		if (valor.doubleValue() > saldo.doubleValue()) {
			throw new RuntimeException("Valor não pode ser maior que saldo!");
		}
		this.saldo = this.saldo.subtract(valor);
	}
	
	
	public void depositar(BigDecimal valor) {
		if (valor.doubleValue() <= 0) {
			throw new RuntimeException("Valor não pode ser negativo ou Zero!");
		}		
		this.saldo = this.saldo.add(valor);
	}
	

	
	
}
