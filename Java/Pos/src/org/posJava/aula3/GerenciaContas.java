package org.posJava.aula3;

import java.util.LinkedList;
import java.util.List;

public class GerenciaContas {

	private static List<Conta>   listaContas   = new LinkedList<>();
	private static List<Agencia> listaAgencias = new LinkedList<>();
	private static List<Cliente> listaClientes = new LinkedList<>();
	
	// construtores ===============================================================
	public GerenciaContas() {
	}

	public GerenciaContas(List<Conta> listaContas, List<Agencia> listaAgencias,
			List<Cliente> listaClientes) {
		super();
		GerenciaContas.listaContas = listaContas;
		GerenciaContas.listaAgencias = listaAgencias;
		GerenciaContas.listaClientes = listaClientes;
	}


    // Metodos ====================================================================
	// Agencias
	public static void inserirAgencia(Agencia agencia) {
		listaAgencias.add(agencia);
	}
	public static void listarAgencias(){
		for (Agencia agencia : listaAgencias) {
			System.out.println(agencia.toString());
		}
	}
	public static void apagarAgencias(int numeroAgencia) {
		for(int i=0;i<listaAgencias.size(); i++){
			if(listaAgencias.get(i).getNumero() == numeroAgencia) {
				listaAgencias.remove(i);
				i--;
			}
		}
	}
	public static void atualizarAgencias(int numeroAgencia, Agencia agencia) {
		for (int i=0;i<listaAgencias.size();i++) {
			if(listaAgencias.get(i).getNumero() == numeroAgencia) {
				listaAgencias.set(i, agencia);
			}
		}
	}
	
	// Clientes		
	public static void inserirCliente(Cliente cliente){
		listaClientes.add(cliente);
	}
	public static void listarClientes(){
		for (Cliente cliente : listaClientes){
			System.out.println(cliente.toString());
		}
	}
	public static void apagarCliente(String cpfCliente){
		for(int i=0;i<listaClientes.size();i++){
			if(listaClientes.get(i).getCpf().equals(cpfCliente)){
				listaClientes.remove(i);
				i--;
			}
		}
	}
	public static void atualizarClientes(String cpfCliente, Cliente cliente) {
		for (int i=0;i<listaClientes.size();i++){
			if(listaClientes.get(i).getCpf().equals(cpfCliente)){
				listaClientes.set(i, cliente);
			}
		}
	}
	
	
	//Contas
	public static void inserirConta(Conta conta){
		listaContas.add(conta);
	}
	public static void listarConta(){
		for(Conta conta: listaContas){
			System.out.println(conta.toString());
		}
	}
	public static void apagarConta(int numeroConta){
		for(int i=0;i<listaContas.size();i++) {
			if(listaContas.get(i).getNumero() == numeroConta){
				listaContas.remove(i);
				i--;
			}
		}
	}
	public static void atualizarConta(int numeroConta, Conta conta){
		for(int i=0;i<listaContas.size();i++){
			if(listaContas.get(i).getNumero() == numeroConta){
				listaContas.set(i, conta);
			}
		}
	}
	
	
	// getters e Setters ==========================================================
	public static List<Conta> getListaContas() {
		return listaContas;
	}

	public static void setListaContas(List<Conta> listaContas) {
		GerenciaContas.listaContas = listaContas;
	}

	public static List<Agencia> getListaAgencias() {
		return listaAgencias;
	}

	public static void setListaAgencias(List<Agencia> listaAgencias) {
		GerenciaContas.listaAgencias = listaAgencias;
	}

	public static List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public static void setListaClientes(List<Cliente> listaClientes) {
		GerenciaContas.listaClientes = listaClientes;
	}
		
	
	
}
