package org.nioun.essentials.niountransport;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BailVoiture extends Bail{

	@ManyToOne
	@JoinColumn(name="voitureId")
	public Voiture voiture ;
	
	public int prix ;
	
	
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + prix;
		result = prime * result + ((voiture == null) ? 0 : voiture.hashCode());
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
		BailVoiture other = (BailVoiture) obj;
		if (prix != other.prix)
			return false;
		if (voiture == null) {
			if (other.voiture != null)
				return false;
		} else if (!voiture.equals(other.voiture))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BailVoiture [voiture=" + voiture + ", prix=" + prix + "]";
	}
	
	
	
	
}
