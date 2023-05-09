package org.nioun.essentials.niounfull.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Village extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "communeArrondId")
	public CommuneArrond communeArrond ;
	
	public String nom;
	
	
	public CommuneArrond getCommuneArrond() {
		return communeArrond;
	}
	public void setCommuneArrond(CommuneArrond communeArrond) {
		this.communeArrond = communeArrond;
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
		result = prime * result + ((communeArrond == null) ? 0 : communeArrond.hashCode());
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
		Village other = (Village) obj;
		if (communeArrond == null) {
			if (other.communeArrond != null)
				return false;
		} else if (!communeArrond.equals(other.communeArrond))
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
		return "Village [communeArrond=" + communeArrond + ", nom=" + nom + "]";
	}
	
	
	
}
