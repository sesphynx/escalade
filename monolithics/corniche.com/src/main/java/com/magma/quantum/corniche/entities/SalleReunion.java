package com.magma.quantum.corniche.entities;

public class SalleReunion extends Logis {
	
	public int pieces ;
	public boolean carreVip ;
	public boolean videoCouverture ;
	public int   nombreEcran ;
	public boolean sonoCouverture ;
	public String capacite ;
	public int placesAssises ;
	public int nbreLoges ;
	
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public boolean isCarreVip() {
		return carreVip;
	}
	public void setCarreVip(boolean carreVip) {
		this.carreVip = carreVip;
	}
	public boolean isVideoCouverture() {
		return videoCouverture;
	}
	public void setVideoCouverture(boolean videoCouverture) {
		this.videoCouverture = videoCouverture;
	}
	public int getNombreEcran() {
		return nombreEcran;
	}
	public void setNombreEcran(int nombreEcran) {
		this.nombreEcran = nombreEcran;
	}
	public boolean isSonoCouverture() {
		return sonoCouverture;
	}
	public void setSonoCouverture(boolean sonoCouverture) {
		this.sonoCouverture = sonoCouverture;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	public int getPlacesAssises() {
		return placesAssises;
	}
	public void setPlacesAssises(int placesAssises) {
		this.placesAssises = placesAssises;
	}
	public int getNbreLoges() {
		return nbreLoges;
	}
	public void setNbreLoges(int nbreLoges) {
		this.nbreLoges = nbreLoges;
	}
	
	

}
