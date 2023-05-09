package org.nioun.essentials.machinter.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description="Codification de type Rappel ")
public class Rappel extends Codification {
	
	
	
	private Date dateRappel ;
	private boolean etat ;
	
	
	
	
	/**
	 * 
	 */
	public Rappel() {
	}
	
	
	/**
	 * @param dateRappel
	 * @param etat
	 */
	public Rappel(Date dateRappel, boolean etat) {
		super();
		this.dateRappel = dateRappel;
		this.etat = etat;
	}


	/**
	 * @return the dateRappel
	 */
	public Date getDateRappel() {
		return dateRappel;
	}
	/**
	 * @param dateRappel the dateRappel to set
	 */
	public void setDateRappel(Date dateRappel) {
		this.dateRappel = dateRappel;
	}
	
	/**
	 * @return the etat
	 */
	public boolean isEtat() {
		return etat;
	}
	/**
	 * @param etat the etat to set
	 */
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateRappel == null) ? 0 : dateRappel.hashCode());
		result = prime * result + (etat ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rappel other = (Rappel) obj;
		if (dateRappel == null) {
			if (other.dateRappel != null)
				return false;
		} else if (!dateRappel.equals(other.dateRappel))
			return false;
		if (etat != other.etat)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rappel [ dateRappel=" + dateRappel + ", etat="
				+ etat + "]";
	}
	
	

}
