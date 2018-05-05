package org.posJava.aula3;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		int opcao = 0 ;
		
		Agencia ag = new Agencia(001,"Agencia 1");	
		GerenciaContas.inserirAgencia(ag);
		GerenciaContas.listarAgencias();
		Cliente cli = new Cliente("999","helder");
		GerenciaContas.inserirCliente(cli);
		GerenciaContas.listarClientes();
		Conta conta1 = new Conta(123,ag,cli,"123");
		GerenciaContas.inserirConta(conta1);
		GerenciaContas.listarConta();  
		
		do {
			menu();
			opcao = Integer.parseInt(scan.nextLine());

			switch (opcao) { 
			case 1:  // cadastrar conta				
				Conta conta;
				conta = cadastrarConta(scan);
				GerenciaContas.inserirConta(conta);
				
				break;				
			case 2: // depositar
				depositar(scan);
				break;
			case 3: // sacar
				sacar(scan);
				break;
			case 4: // ver saldo
				saldo(scan);
				break;
			case 5: // listar Contas
				GerenciaContas.listarConta(); 
				break;				
			case 6: // cadastrar Agencias				
				Agencia agencia;
				agencia = cadastrarAgencias(scan);
				GerenciaContas.inserirAgencia(agencia);
				break;				
			case 7: // cadastrar Clientes
				Cliente cliente;
				cliente = cadastrarCliente(scan);
				GerenciaContas.inserirCliente(cliente);
				break;				
			case 8: 				
				System.out.println("Até Breve");
				sair = true;
				break;
			case 9:
				GerenciaContas.listarClientes();
				GerenciaContas.listarAgencias();
			}
			
		}  while (sair == false);		

		scan.close();
		
	}
	
	// +=============================================================================================================
	public static void menu() {
		System.out.println("*********** MENU ***************");
		System.out.println("1 - Cadastrar Conta "); // ok
		System.out.println("2 - Depositar "); // ok
		System.out.println("3 - Sacar "); //ok
		System.out.println("4 - Ver Saldo"); //ok
		System.out.println("5 - Ver Contas ");  //ok
		System.out.println("6 - Cadastrar Agência "); // ok
		System.out.println("7 - Cadastrar Clientes "); // ok
		System.out.println("8 - Sair ");
		System.out.println("9 - lista clientes e Agencia");

	}

	// 1 +=============================================================================================================
	public static Conta cadastrarConta(Scanner scan) {
		Conta conta = new Conta();
		Cliente cliente;
		Agencia agencia;
		int numeroAg;
		String cpfCli;
		
		System.out.println("Entre com o número da conta ");
		conta.setNumero(Integer.parseInt(scan.nextLine()));
		System.out.println("Entre com o número da Agencia");
		numeroAg = Integer.parseInt(scan.nextLine());
		agencia = localizarAgencia(GerenciaContas.getListaAgencias(), numeroAg);
		conta.setAgencia(agencia);
		System.out.println("Entre com o cpf do Cliente");
		cpfCli = scan.nextLine();
		cliente = localizarCliente(GerenciaContas.getListaClientes(), cpfCli);
		conta.setCliente(cliente);
		System.out.println("Informe a Senha");
		conta.setSenha(scan.nextLine());
		System.out.println("Informe o Saldo da Conta");
		conta.setSaldo( BigDecimal.valueOf(Double.parseDouble(scan.nextLine()))); 
		return conta;
	}

	// 2 +=============================================================================================================
	public static void depositar(Scanner scan) {
		
		Conta conta = new Conta();
		BigDecimal value, resultado;
		
		System.out.println("========2  DEPÓSITO  ===============");
			
		System.out.println("Entre com o número da conta ");
		int numConta = Integer.parseInt(scan.nextLine());
		conta = localizarConta(GerenciaContas.getListaContas(),numConta);
		System.out.println("Informe o valor do depósito: ");
		value = new BigDecimal(scan.nextLine());
		
		if (value.intValue() == 0) {
			System.out.println("Valor de Depósito não pode ser zero");
		} else {
			resultado = conta.getSaldo();
			conta.setSaldo(resultado.add(value));
			GerenciaContas.atualizarConta(numConta, conta);			
		}
	
	}
	
	// 3 +=============================================================================================================
	public static void sacar(Scanner scan) {
		System.out.println("========3  SACAR  ===============");
		Conta conta = new Conta();
		BigDecimal value, resultado, atual;
				
		System.out.println("Entre com o número da conta ");
		int numConta = Integer.parseInt(scan.nextLine());
		conta = localizarConta(GerenciaContas.getListaContas(),numConta);
		System.out.println("Informe o valor do saque: ");
		value = new BigDecimal(scan.nextLine());
		
		if ((value.intValue() == 0) || (value.intValue() < 0) ) {
			System.out.println("Valor de Saque não pode ser zero ou negativo");
		} else {
			atual = conta.getSaldo();
			resultado = (atual.subtract(value));
			if (resultado.intValue() < 0) {
				System.out.println("Valor do Saque superior ao Saldo");
			} else {
				conta.setSaldo(resultado);
				GerenciaContas.atualizarConta(numConta, conta);	
			}
						
		}		
		
	}
	
	// 4 +=============================================================================================================
	public static void saldo(Scanner scan) {
		System.out.println("========4  SALDO  ===============");
		Conta conta = new Conta();
		System.out.println("Entre com o número da conta ");
		int numConta = Integer.parseInt(scan.nextLine());
		conta = localizarConta(GerenciaContas.getListaContas(),numConta);
		System.out.println(conta.toString());
		
	}
	
	// 6 +============================================================================================================= ok	
	public static Agencia cadastrarAgencias(Scanner scan) {
		int codigoAg;
		String nomeAg;

		System.out.println("========6  CADASTRO DE AGÊNCIAS ===============");
		System.out.print("informe o código da agência");
		codigoAg = Integer.parseInt(scan.nextLine());
		System.out.print("informe o nome da agência");
		nomeAg = scan.nextLine();
		Agencia agencia = new Agencia(codigoAg,nomeAg);
		return agencia;
	}
	// 7 +=============================================================================================================ok
	public static Cliente cadastrarCliente(Scanner scan) {
		String nomeCli;
		String cpfCli;

		System.out.println("========7  CADASTRO DE CLIENTES ===============");
		System.out.print("informe o cpf do Cliente");
		cpfCli = scan.nextLine();
		System.out.print("informe o nome da cliente");
		nomeCli = scan.nextLine();

		Cliente cliente = new Cliente(cpfCli,nomeCli);
		return cliente;
	}

	
	// MÉTODOS AUXILIARES
	// +=============================================================================================================	
	public static Agencia localizarAgencia(List<Agencia> list, int numero) {
		for (Agencia agencia : list) {
			if (agencia.getNumero() == numero) 
				return agencia;
		}
		System.out.println("Agência não localizada");
		return null;
	}

	// +=============================================================================================================
	public static Cliente localizarCliente(List<Cliente> lista, String cpf) {
		for (Cliente cliente : lista ) {
			if (cliente.getCpf().equals(cpf)) 
				return cliente;
		}
		System.out.println("Cliente não localizado");
		return null;
	}

	// +=============================================================================================================
	public static Conta localizarConta(List<Conta> lista, int numero) {
		for (Conta conta : lista) {
			if (conta.getNumero() == numero) 
				return conta;
		}
		System.out.println("conta não localizada");
		return null;
	}


}
