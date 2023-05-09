package org.nioun.essentials.tontine.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Tontine {

	@Id
	@GeneratedValue
	Long tontineId ;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	Date  dateDebut ;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	Date  dateFin ;
	
	String cycle ;
	
	Integer nbreCycles;
	
	BigDecimal mise ;
	
	BigDecimal cagnotte;

	
	
	
	public Tontine() {
		
	}




	public Tontine(Date dateDebut, Date dateFin, String cycle, Integer nbreCycles, BigDecimal mise, BigDecimal cagnotte) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.cycle = cycle;
		this.nbreCycles = nbreCycles;
		this.mise = mise;
		this.cagnotte = cagnotte;
	}




	public Long getTontineId() {
		return tontineId;
	}




	public void setTontineId(Long tontineId) {
		this.tontineId = tontineId;
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




	public String getCycle() {
		return cycle;
	}




	public void setCycle(String cycle) {
		this.cycle = cycle;
	}




	public Integer getNbreCycles() {
		return nbreCycles;
	}




	public void setNbreCycles(Integer nbreCycles) {
		this.nbreCycles = nbreCycles;
	}




	public BigDecimal getMise() {
		return mise;
	}




	public void setMise(BigDecimal mise) {
		this.mise = mise;
	}




	public BigDecimal getCagnotte() {
		return cagnotte;
	}




	public void setCagnotte(BigDecimal cagnotte) {
		this.cagnotte = cagnotte;
	}




	@Override
	public String toString() {
		return "Tontine [tontineId=" + tontineId + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", cycle="
				+ cycle + ", nbreCycles=" + nbreCycles + ", mise=" + mise + ", cagnotte=" + cagnotte + "]";
	}



	
	
}
