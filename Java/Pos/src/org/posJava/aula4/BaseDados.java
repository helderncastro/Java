package org.posJava.aula4;

import java.util.ArrayList;
import java.util.List;

public class BaseDados {

	private List<Cd> listaCds = new ArrayList<>();
	private List<Video> listaVideos = new ArrayList<>();

	public BaseDados() {
	}
	 		
	public BaseDados(List<Cd> listaCds, List<Video> listaVideos) {
		this.listaCds = listaCds;
		this.listaVideos = listaVideos;
	}

	/* CDS ==========================================================================================*/
	public void inserirCd (Cd cd) {
		listaCds.add(cd);
	}	
	
	public void apagarCd(int idCd) {		
		/* esta forma não permite remover mais de um */
		for (Cd cd: listaCds) {
			if (cd.getId() == idCd) {
				listaCds.remove(idCd);
				break;
			}
		}
	}

	public void listarCds() {
		for(Cd cd : listaCds) {
			System.out.println(cd.toString());
		}
	}
	
	public void atualizarCd(int idCd, Cd cd) {
		for(int i=0;i<listaCds.size();i++){
			if(listaCds.get(i).getId() == idCd){
				listaCds.set(i,cd);
			}
		}
	}	

	
	/* VIDEOS ==========================================================================================*/
	
	public void inserirVideo(Video video) {
		listaVideos.add(video);		
	}
	
	
	public void apagarVideo(int idVideo) {
		for(int i=0;i<listaVideos.size(); i++) {
			if(listaVideos.get(i).getId() == idVideo) {
				listaVideos.remove(i);
				i--; // voltar o índice porque a lista é reindexada quando o ítem for apagado.
			}
		}
	}

	public void listarVideos() {
		for(Video video: listaVideos){
			System.out.println(video.toString());
		}
	}
	
	public void atualizarVideo(int idVideo, Video video) {
		for (int i=0;i<listaVideos.size();i++){
			if(listaVideos.get(i).getId() == idVideo){
				listaVideos.set(i, video);
			}
		}
	}
	
	/*  GETTERS E SETTERS ================================================================*/

	public List<Cd> getListaCds() {
		return listaCds;
	}

	public void setListaCds(List<Cd> listaCds) {
		this.listaCds = listaCds;
	}

	public List<Video> getListaVideos() {
		return listaVideos;
	}

	public void setListaVideos(List<Video> listaVideos) {
		this.listaVideos = listaVideos;
	}

	
}
