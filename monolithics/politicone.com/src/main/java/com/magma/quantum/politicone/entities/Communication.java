package com.magma.quantum.politicone.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Communication extends AbstractEntity{
	
	public String libelle ;
	public String descriptif ;
	@OneToOne
	@JoinColumn(name="entiteId")
	public Entite entite ;
	
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	public Entite getEntite() {
		return entite;
	}
	public void setEntite(Entite entite) {
		this.entite = entite;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
		result = prime * result + ((entite == null) ? 0 : entite.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Communication other = (Communication) obj;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (entite == null) {
			if (other.entite != null)
				return false;
		} else if (!entite.equals(other.entite))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Communication [libelle=" + libelle + ", descriptif=" + descriptif + ", entite=" + entite + "]";
	}
	
	
	
}
