package org.posJava.aula2.agenda;

import java.util.LinkedList;
import java.util.List;

public class TesteAgenda {
	
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		List<Telefone> telefones = new LinkedList<>();
		
		telefones.add(new Telefone("Residencial", 11111111));
		
		agenda.addContato(new Contato(1, "Ze", new Endereco("Rua 1", 565, "Centro", 38300078), telefones));
		agenda.addContato(new Contato(2, "Jose", new Endereco("Rua 2", 565, "Centro", 38300078), telefones));
		agenda.addContato(new Contato(3, "Joaquim", new Endereco("Rua 3", 565, "Centro", 38300078), telefones));
		agenda.addContato(new Contato(3, "Adão", new Endereco("Rua 4", 565, "Centro", 38300078), telefones));
		
		agenda.mostraContatos();
		agenda.delContatosByIndex(2);
		agenda.mostraContatos();
		Contato contato = agenda.getContatoByid(1);
		contato.mostra();
	}
}
