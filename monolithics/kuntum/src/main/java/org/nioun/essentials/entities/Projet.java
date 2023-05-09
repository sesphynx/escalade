package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projet extends AbstractEntity  {
	
	public int budget ;
	
	public String devise ;
	
	@OneToMany(mappedBy="projet")
	public List<Acquisition> acquisitions ;
		
	public String resume ;
	
	public String uniteTempsRentabilite ;
	
	public int seuilDeRentabilite ;
	
	public String nom ;
	
	@ManyToOne
	@JoinColumn(name="promoteurId")
	public Promoteur promoteur ;

	
	
	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public List<Acquisition> getAcquisitions() {
		return acquisitions;
	}

	public void setAcquisitions(List<Acquisition> acquisitions) {
		this.acquisitions = acquisitions;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getUniteTempsRentabilite() {
		return uniteTempsRentabilite;
	}

	public void setUniteTempsRentabilite(String uniteTempsRentabilite) {
		this.uniteTempsRentabilite = uniteTempsRentabilite;
	}

	public int getSeuilDeRentabilite() {
		return seuilDeRentabilite;
	}

	public void setSeuilDeRentabilite(int seuilDeRentabilite) {
		this.seuilDeRentabilite = seuilDeRentabilite;
	}

	public Promoteur getPromoteur() {
		return promoteur;
	}

	public void setPromoteur(Promoteur promoteur) {
		this.promoteur = promoteur;
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
		result = prime * result + ((acquisitions == null) ? 0 : acquisitions.hashCode());
		result = prime * result + budget;
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((promoteur == null) ? 0 : promoteur.hashCode());
		result = prime * result + ((resume == null) ? 0 : resume.hashCode());
		result = prime * result + seuilDeRentabilite;
		result = prime * result + ((uniteTempsRentabilite == null) ? 0 : uniteTempsRentabilite.hashCode());
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
		Projet other = (Projet) obj;
		if (acquisitions == null) {
			if (other.acquisitions != null)
				return false;
		} else if (!acquisitions.equals(other.acquisitions))
			return false;
		if (budget != other.budget)
			return false;
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (promoteur == null) {
			if (other.promoteur != null)
				return false;
		} else if (!promoteur.equals(other.promoteur))
			return false;
		if (resume == null) {
			if (other.resume != null)
				return false;
		} else if (!resume.equals(other.resume))
			return false;
		if (seuilDeRentabilite != other.seuilDeRentabilite)
			return false;
		if (uniteTempsRentabilite == null) {
			if (other.uniteTempsRentabilite != null)
				return false;
		} else if (!uniteTempsRentabilite.equals(other.uniteTempsRentabilite))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Projet [budget=" + budget + ", devise=" + devise + ", acquisitions=" + acquisitions + ", resume="
				+ resume + ", uniteTempsRentabilite=" + uniteTempsRentabilite + ", seuilDeRentabilite="
				+ seuilDeRentabilite + ", nom=" + nom + ", promoteur=" + promoteur + "]";
	}
	
	
	
}
