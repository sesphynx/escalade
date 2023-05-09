package org.nioun.essentials.niounfull.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commune extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="villeId")
	public Ville ville ;
	
	public String nom ;
	
	@OneToMany(mappedBy="commune")
	public List<Quartier> quartiers;

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Quartier> getQuartiers() {
		return quartiers;
	}

	public void setQuartiers(List<Quartier> quartiers) {
		this.quartiers = quartiers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((quartiers == null) ? 0 : quartiers.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (quartiers == null) {
			if (other.quartiers != null)
				return false;
		} else if (!quartiers.equals(other.quartiers))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commune [ville=" + ville + ", nom=" + nom + ", quartiers=" + quartiers + "]";
	}
	
	

}
