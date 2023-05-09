package com.magma.quantum.machintech.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity 
@RequestMapping("/vente")
public class Vente extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="userId")
	private User user ;
	
	@ManyToMany	
	private List<Offre> offres ;
	
	private Date dateVente ;
	private String dureeEngagement ;
	private boolean etat ;
	
	
	
	/**
	 * 
	 */
	public Vente() {
	}
	/**
	 * @param user
	 * @param offres
	 * @param dateVente
	 * @param dureeEngagement
	 * @param etat
	 */
	public Vente(User user, List<Offre> offres, Date dateVente, String dureeEngagement, boolean etat) {
		super();
		this.user = user;
		this.offres = offres;
		this.dateVente = dateVente;
		this.dureeEngagement = dureeEngagement;
		this.etat = etat;
	}
	public User getUser() {
		return user;
	}
	public void setConseiller(User user) {
		this.user = user;
	}
	/**
	 * @return the offre
	 */
	public List<Offre> getOffres() {
		return offres;
	}
	/**
	 * @param offre the offre to set
	 */
	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}
	/**
	 * @return the dateVente
	 */
	public Date getDateVente() {
		return dateVente;
	}
	/**
	 * @param dateVente the dateVente to set
	 */
	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}
	/**
	 * @return the dureeEngagement
	 */
	public String getDureeEngagement() {
		return dureeEngagement;
	}
	/**
	 * @param dureeEngagement the dureeEngagement to set
	 */
	public void setDureeEngagement(String dureeEngagement) {
		this.dureeEngagement = dureeEngagement;
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
		result = prime * result + ((dateVente == null) ? 0 : dateVente.hashCode());
		result = prime * result + ((dureeEngagement == null) ? 0 : dureeEngagement.hashCode());
		result = prime * result + (etat ? 1231 : 1237);
		result = prime * result + ((offres == null) ? 0 : offres.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Vente other = (Vente) obj;
		if (dateVente == null) {
			if (other.dateVente != null)
				return false;
		} else if (!dateVente.equals(other.dateVente))
			return false;
		if (dureeEngagement == null) {
			if (other.dureeEngagement != null)
				return false;
		} else if (!dureeEngagement.equals(other.dureeEngagement))
			return false;
		if (etat != other.etat)
			return false;
		if (offres == null) {
			if (other.offres != null)
				return false;
		} else if (!offres.equals(other.offres))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vente [dateVente=" + dateVente + ", dureeEngagement=" + dureeEngagement + ", etat=" + etat + "]";
	}
	

	
}
