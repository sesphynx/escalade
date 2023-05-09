package com.magma.quantum.corniche.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Plan extends AbstractEntity{
	
	public Date dateDebut ;
	public Date dateFinValidité ;
	public int Solde ;
	public String typePlan ;
	
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFinValidité() {
		return dateFinValidité;
	}
	public void setDateFinValidité(Date dateFinValidité) {
		this.dateFinValidité = dateFinValidité;
	}
	public int getSolde() {
		return Solde;
	}
	public void setSolde(int solde) {
		Solde = solde;
	}
	public String getTypePlan() {
		return typePlan;
	}
	public void setTypePlan(String typePlan) {
		this.typePlan = typePlan;
	}
	
	

}
