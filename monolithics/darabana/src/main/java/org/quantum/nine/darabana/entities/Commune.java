package org.quantum.nine.darabana.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Commune extends AbstractEntity {
	
	
	
	public String nom ;
	
	@OneToMany(mappedBy="commune")
	public List<Asc> ascs;	
	
	@OneToMany(mappedBy="commune")
	public List<Bajeen> bajeens;
	
	@OneToMany(mappedBy="commune")
	public List<Benevole> benevoles;
	
	
	
	public Commune() {
		super();
	}
	public Commune(String nom) {
		super();
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Asc> getAscs() {
		return ascs;
	}
	public void setAscs(List<Asc> ascs) {
		this.ascs = ascs;
	}
	public List<Benevole> getBenevoles() {
		return benevoles;
	}
	public void setBenevoles(List<Benevole> benevoles) {
		this.benevoles = benevoles;
	}
	
	public List<Bajeen> getBajeens() {
		return bajeens;
	}
	public void setBajeens(List<Bajeen> bajeens) {
		this.bajeens = bajeens;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ascs == null) ? 0 : ascs.hashCode());
		result = prime * result + ((bajeens == null) ? 0 : bajeens.hashCode());
		result = prime * result + ((benevoles == null) ? 0 : benevoles.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Commune other = (Commune) obj;
		if (ascs == null) {
			if (other.ascs != null)
				return false;
		} else if (!ascs.equals(other.ascs))
			return false;
		if (bajeens == null) {
			if (other.bajeens != null)
				return false;
		} else if (!bajeens.equals(other.bajeens))
			return false;
		if (benevoles == null) {
			if (other.benevoles != null)
				return false;
		} else if (!benevoles.equals(other.benevoles))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  nom  ;
	}


	
	
}
