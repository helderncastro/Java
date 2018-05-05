package org.posJava.aula4.Exerc;

public class Testes {
/*	do item
 *  private int 	id;
	private String 	comentario;
	private boolean emprestado;
	private int		tempoDuracao;
	private String 	titulo;

*	do cd
*	private String 	artista;
	private int    	nroMusicas;
	
	do video
	private String 	diretor;
*
*/
	
	public Testes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseDados baseDados = new BaseDados();
		
		// inserir cd
		Cd cd = new Cd();
		cd.setId(1);
		cd.setComentario("Top");
		cd.setEmprestado(false);
		cd.setTempoDuracao(105);
		cd.setTitulo("As melhores do pior");
		cd.setArtista("Ze das couves");
		cd.setNroMusicas(14);
		
		baseDados.inserirItem(cd);
	
		// inserir video
		Video video = new Video();
		video.setId(2);
		video.setComentario("O melhor filme de ação do ano");
		video.setEmprestado(false);
		video.setTempoDuracao(305);
		video.setTitulo("Rambo 23");	
		video.setDiretor("Silverter está longe");
		
		baseDados.inserirItem(video);
		
		baseDados.listarItens();
		baseDados.apagarItem(1);
		baseDados.apagarItem(2);
		System.out.println("Lista após exclusão============================");
		baseDados.listarItens();
		
		System.out.println("Nova inserção============================");
		// inserir cd
		cd.setId(3);
		cd.setComentario("meia boca");
		cd.setEmprestado(false);
		cd.setTempoDuracao(105);
		cd.setTitulo("As pior do melhor");
		cd.setArtista("Funkeiros");
		cd.setNroMusicas(4);
		baseDados.inserirItem(cd);
		baseDados.listarItens();
		
		
	}

}
