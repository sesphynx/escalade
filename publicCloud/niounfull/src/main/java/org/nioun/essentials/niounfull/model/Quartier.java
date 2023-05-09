package org.nioun.essentials.niounfull.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quartier extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="communeId")
	public Commune commune ;
	public String nom ;
	
	@OneToMany(mappedBy="quartier")
	public List<Cellule> cellules ;
	
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
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
		result = prime * result + ((commune == null) ? 0 : commune.hashCode());
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
		Quartier other = (Quartier) obj;
		if (commune == null) {
			if (other.commune != null)
				return false;
		} else if (!commune.equals(other.commune))
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
		return "Quartier [commune=" + commune + ", nom=" + nom + "]";
	}

	
}
