package org.posJava.aula4;


public class Testes extends BaseDados {

	public static void main(String[] args)  {

		BaseDados baseDados = new BaseDados();
		
		baseDados.inserirCd(new Cd(1, "Xuxa", "o melhor do ano!", false, 12, 90, "Xuxa só para baixinhos!"));
		baseDados.inserirCd(new Cd(2, "Chitãozinho e Xororó", "o mais top!!!", true, 10, 80, "40 anos de sucesso"));
		baseDados.inserirCd(new Cd(1, "Tiao carreiro", "o melhor do ano!", false, 12, 90, "so os modoes!"));
		
		baseDados.inserirVideo(new Video(0, "dsfdfg", "sdfsdf", false, 110, "sdfsdf"));
		baseDados.inserirVideo(new Video(1, "Steven Spielberg", "o melhor filme do dia!", false, 120, "Dunkirk"));
		baseDados.inserirVideo(new Video(1, "José Padilha", "top 10", false, 110, "Tropa de Elite 1"));
		Video video2 = new Video(2, "dsfdfg", "sdfsdf", false, 110, "sdfsdf");
		baseDados.inserirVideo(video2);
		
		System.out.println("Antes de apagar:");
		baseDados.listarVideos();
		baseDados.listarCds();
		
		baseDados.apagarVideo(1);
		baseDados.apagarCd(1);
		
		System.out.println("Depois de apagar o video 1 e o cd 1");
		baseDados.listarVideos();
		baseDados.listarCds();
		
	

		
	}

}
