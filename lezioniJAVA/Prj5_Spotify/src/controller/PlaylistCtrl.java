package controller;

import java.util.ArrayList;
import java.util.List;

import model.Brano;
import model.Playlist;

public class PlaylistCtrl {
	// Questo playlist controller deve avere una lista di partenza con 3 brani al suo interno
	// deve poter aggiungere un brano
	// deve poter rimuovere un brano
	// deve poter stampare l'intera playlist
	// deve poter eseguire un brano (emette una String: ... sto suonando questo brano..)

	private List<Playlist> Playlist;
	public PlaylistCtrl() {
		this.playlist = new ArrayList<>();
		playlist.add(new Brano("The beginning"));
		
		
	}
	private Brano brano;
	private Playlist playlist;
	
	public PlaylistCtrl(Brano brano, Playlist playlist) {

		this.brano = brano;
		this.playlist = playlist;
	}
	
	private boolean aggiungiBrano(String brano) {
		return true;
	}
	
}
