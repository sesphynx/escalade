package org.nioun.essentials.prestasante.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Prestasante {

	@Id
	@GeneratedValue
	Long prestasanteId ;
	
	@DateTimeFormat(iso = ISO.DATE)
	Date  dateConsultation ;
	
	String consultation ;
	
	String domaine ;
	
	String description ;
	
	BigDecimal price;

	
	
	
	public Prestasante() {
		
	}




	public Prestasante(Date dateConsultation, String consultation, String domaine, String description,
			BigDecimal price) {
		
		this.dateConsultation = dateConsultation;
		this.consultation = consultation;
		this.domaine = domaine;
		this.description = description;
		this.price = price;
	}




	public Long getPrestasanteId() {
		return prestasanteId;
	}




	public void setPrestasanteId(Long prestasanteId) {
		this.prestasanteId = prestasanteId;
	}




	public Date getDateConsultation() {
		return dateConsultation;
	}




	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}




	public String getConsultation() {
		return consultation;
	}




	public void setConsultation(String consultation) {
		this.consultation = consultation;
	}




	public String getDomaine() {
		return domaine;
	}




	public void setDomaine(String domaine) {
		this.domaine = domaine;
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
		return "Prestasante [prestasanteId=" + prestasanteId + ", dateConsultation=" + dateConsultation
				+ ", consultation=" + consultation + ", domaine=" + domaine + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	
	
	
	
	
}
