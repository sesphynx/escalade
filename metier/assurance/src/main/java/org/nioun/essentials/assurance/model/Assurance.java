package org.nioun.essentials.assurance.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Assurance {

	@Id
	@GeneratedValue
	Long assuranceId ;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	Date  dateDebut;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	Date dateFin ;
	
	String libelle ;
	
	String description ;
	
	BigDecimal price;

	
	
	
	public Assurance() {
		
	}


	public Long getAssuranceId() {
		return assuranceId;
	}



	public void setAssuranceId(Long assuranceId) {
		this.assuranceId = assuranceId;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}






	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public BigDecimal getPrice() {
		return price;
	}




	public void setPrice(BigDecimal price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Assurance [assuranceId=" + assuranceId + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", libelle=" + libelle + ", description=" + description + ", price=" + price + "]";
	}



	
	
	
	
	
	
}
