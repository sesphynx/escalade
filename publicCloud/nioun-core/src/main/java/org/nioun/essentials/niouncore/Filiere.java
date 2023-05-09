package org.nioun.essentials.niouncore;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Filiere extends AbstractEntity{
	
	public String nom;
	public String descriptif ;
	

	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
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
		Filiere other = (Filiere) obj;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
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
		return "Filiere [nom=" + nom + ", descriptif=" + descriptif + "]";
	}
	
	
}
