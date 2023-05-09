package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Filiere extends AbstractEntity{
	
	public String nom;
	public String descriptif ;
	
	
	@OneToMany(mappedBy="filiere")
	public List<Faiseur> faiseurs ;
	
	@OneToMany(mappedBy="filiere")
	public List<Intervention> interventions ;
	
	@ManyToMany
	public List<Producteur> producteurs ;
	
	@ManyToMany
	public List<Bailleur> bailleurs ;
	
	
	public List<Faiseur> getFaiseurs() {
		return faiseurs;
	}
	public void setFaiseurs(List<Faiseur> faiseurs) {
		this.faiseurs = faiseurs;
	}
	public List<Intervention> getInterventions() {
		return interventions;
	}
	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}
	public List<Producteur> getProducteurs() {
		return producteurs;
	}
	public void setProducteurs(List<Producteur> producteurs) {
		this.producteurs = producteurs;
	}
	
	
	public List<Bailleur> getBailleurs() {
		return bailleurs;
	}
	public void setBailleurs(List<Bailleur> bailleurs) {
		this.bailleurs = bailleurs;
	}
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
		result = prime * result + ((bailleurs == null) ? 0 : bailleurs.hashCode());
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
		result = prime * result + ((faiseurs == null) ? 0 : faiseurs.hashCode());
		result = prime * result + ((interventions == null) ? 0 : interventions.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((producteurs == null) ? 0 : producteurs.hashCode());
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
		if (bailleurs == null) {
			if (other.bailleurs != null)
				return false;
		} else if (!bailleurs.equals(other.bailleurs))
			return false;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (faiseurs == null) {
			if (other.faiseurs != null)
				return false;
		} else if (!faiseurs.equals(other.faiseurs))
			return false;
		if (interventions == null) {
			if (other.interventions != null)
				return false;
		} else if (!interventions.equals(other.interventions))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (producteurs == null) {
			if (other.producteurs != null)
				return false;
		} else if (!producteurs.equals(other.producteurs))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Filiere [nom=" + nom + ", descriptif=" + descriptif + ", faiseurs=" + faiseurs + ", interventions="
				+ interventions + ", producteurs=" + producteurs + ", bailleurs=" + bailleurs + "]";
	}
	
	

}
