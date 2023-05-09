package com.magma.quantum.politicone.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pays extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="federationId")
	public Federation federation ;
	
	public String nom ;
	
	@OneToMany(mappedBy="pays")
	public List<Region> regions ;

	
	public Federation getFederation() {
return federation;
	}

	public void setFederation(Federation federation) {
		this.federation = federation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((federation == null) ? 0 : federation.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		Pays other = (Pays) obj;
		if (federation == null) {
			if (other.federation != null)
				return false;
		} else if (!federation.equals(other.federation))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pays [ nom=" + nom + ", regions=" + regions + "]";
	} 
	
	
	
}
