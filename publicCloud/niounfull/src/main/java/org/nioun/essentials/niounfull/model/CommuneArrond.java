package org.nioun.essentials.niounfull.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CommuneArrond extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="departementId")
	public Departement departement ;
	
	public String nom ;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="communeArrond")
	public List<Village> villages ;
	
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Village> getVillages() {
		return villages;
	}
	public void setVillages(List<Village> villages) {
		this.villages = villages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((departement == null) ? 0 : departement.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((villages == null) ? 0 : villages.hashCode());
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
		CommuneArrond other = (CommuneArrond) obj;
		if (departement == null) {
			if (other.departement != null)
				return false;
		} else if (!departement.equals(other.departement))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (villages == null) {
			if (other.villages != null)
				return false;
		} else if (!villages.equals(other.villages))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CommuneArrond [departement=" + departement + ", nom=" + nom + ", villages=" + villages + "]";
	}
	
		
}
