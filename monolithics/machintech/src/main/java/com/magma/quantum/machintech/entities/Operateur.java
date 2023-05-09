package com.magma.quantum.machintech.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Operateur extends AbstractEntity{

	@OneToMany (mappedBy="operateur",cascade=CascadeType.ALL)
	private List<Campagne> campagnes ;
	
	@OneToMany (mappedBy="operateur",cascade=CascadeType.ALL)
	private List<Offre> offres ;
	
	
	private String nom ;
	
	
	

	public List<Campagne> getCampagnes() {
		return campagnes;
	}

	public void setCampagnes(List<Campagne> campagnes) {
		this.campagnes = campagnes;
	}
	
	

	public List<Offre> getOffres() {
		return offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((campagnes == null) ? 0 : campagnes.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((offres == null) ? 0 : offres.hashCode());
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
		Operateur other = (Operateur) obj;
		if (campagnes == null) {
			if (other.campagnes != null)
				return false;
		} else if (!campagnes.equals(other.campagnes))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (offres == null) {
			if (other.offres != null)
				return false;
		} else if (!offres.equals(other.offres))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Operateur [campagnes=" + campagnes + ", offres=" + offres + ", nom=" + nom + "]";
	}
	
}
