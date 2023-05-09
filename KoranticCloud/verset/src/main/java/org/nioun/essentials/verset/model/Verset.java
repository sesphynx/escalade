package org.nioun.essentials.verset.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Verset {

	@Id
	@GeneratedValue
	Long versetId;
	 
	Long suratId;
	
	Integer ordre ;
	
	String tour;
	
	String libelle;
	
	String extraction ;

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
