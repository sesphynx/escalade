package org.nioun.essentials. niounfull.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="regionId")
	public Region region;
	
	public String nom ;
	
	@OneToMany(mappedBy="departement")
	public List<CommuneArrond> communeArronds ;

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<CommuneArrond> getCommuneArronds() {
		return communeArronds;
	}

	public void setCommuneArronds(List<CommuneArrond> communeArronds) {
		this.communeArronds = communeArronds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((communeArronds == null) ? 0 : communeArronds.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		Departement other = (Departement) obj;
		if (communeArronds == null) {
			if (other.communeArronds != null)
				return false;
		} else if (!communeArronds.equals(other.communeArronds))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departement [region=" + region + ", nom=" + nom + ", communeArronds=" + communeArronds + "]";
	}
	
	
}
