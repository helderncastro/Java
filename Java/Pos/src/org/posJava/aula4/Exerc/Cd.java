package org.posJava.aula4.Exerc;

public class Cd extends Item {

	private String 	artista;
	private int    	nroMusicas;
	
	// construtores ---------------------------------------------------------
	public Cd() {
		// TODO Auto-generated constructor stub
	}

	public Cd(String artista, int nroMusicas) {
		super();
		this.artista = artista;
		this.nroMusicas = nroMusicas;
	}
   // to string()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CD - " + super.toString() + ", Artista= " + artista + ", Nº Músicas: " + nroMusicas;
	}	

	
	// get e set -------------------------------------------------------------
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNroMusicas() {
		return nroMusicas;
	}
	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}

	
	
	
	

	
	
	
}
