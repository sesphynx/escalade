package org.nioun.essentials.naneurone.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Naneurone {

	@Id
	@GeneratedValue
	Long	naneuroneId;

	Long versetId;
	 
	Long suratId;
	
	Integer ordre ;
	
	String tour;
	
	String libelle;
	
	String extraction ;

	String valeur ;
	


	public Long getNaneuroneId() {
		return naneuroneId;
	}

	public void setNaneuroneId(Long naneuroneId) {
		this.naneuroneId = naneuroneId;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public Long getVersetId() {
		return versetId;
	}

	public void setVersetId(Long versetId) {
		this.versetId = versetId;
	}

	public Long getSuratId() {
		return suratId;
	}

	public void setSuratId(Long suratId) {
		this.suratId = suratId;
	}

	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public String getTour() {
		return tour;
	}

	public void setTour(String tour) {
		this.tour = tour;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getExtraction() {
		return extraction;
	}

	public void setExtraction(String extraction) {
		this.extraction = extraction;
	}

		
	
}
