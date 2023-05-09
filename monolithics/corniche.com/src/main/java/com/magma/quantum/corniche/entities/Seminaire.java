package com.magma.quantum.corniche.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Seminaire extends Evenement{
	
	public String organisateur ;
	public Date DateFinEvnmt ; 
	public Logis lieuTenue ;
	
	public String getOrganisateur() {
		return organisateur;
	}
	public void setOrganisateur(String organisateur) {
		this.organisateur = organisateur;
	}
	public Date getDateFinEvnmt() {
		return DateFinEvnmt;
	}
	public void setDateFinEvnmt(Date dateFinEvnmt) {
		DateFinEvnmt = dateFinEvnmt;
	}
	public Logis getLieuTenue() {
		return lieuTenue;
	}
	public void setLieuTenue(Logis lieuTenue) {
		this.lieuTenue = lieuTenue;
	} 
	
	

}
