package org.nioun.essentials.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Acquisition extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="projetId")
	public Projet projet ;
	
	@ManyToOne
	@JoinColumn(name="financierId")
	public Financier financier ;
	
	public int montant ;
	
	public int pourcentagePerCapita ;

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Financier getFinancier() {
		return financier;
	}

	public void setFinancier(Financier financier) {
		this.financier = financier;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public int getPourcentagePerCapita() {
		return pourcentagePerCapita;
	}

	public void setPourcentagePerCapita(int pourcentagePerCapita) {
		this.pourcentagePerCapita = pourcentagePerCapita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((financier == null) ? 0 : financier.hashCode());
		result = prime * result + montant;
		result = prime * result + pourcentagePerCapita;
		result = prime * result + ((projet == null) ? 0 : projet.hashCode());
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
		Acquisition other = (Acquisition) obj;
		if (financier == null) {
			if (other.financier != null)
				return false;
		} else if (!financier.equals(other.financier))
			return false;
		if (montant != other.montant)
			return false;
		if (pourcentagePerCapita != other.pourcentagePerCapita)
			return false;
		if (projet == null) {
			if (other.projet != null)
				return false;
		} else if (!projet.equals(other.projet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acquisition [projet=" + projet + ", financier=" + financier + ", montant=" + montant
				+ ", pourcentagePerCapita=" + pourcentagePerCapita + "]";
	} 
	
	
	

}
