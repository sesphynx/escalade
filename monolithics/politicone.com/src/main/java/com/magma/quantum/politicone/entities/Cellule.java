package com.magma.quantum.politicone.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cellule extends Entite{
	
	@ManyToOne
	@JoinColumn(name="quartierId")
	public Quartier quartier ;
	public int numero ;
	
	
	public Quartier getQuartier() {
		return quartier;
	}
	public void setQuartier(Quartier quartier) {
		this.quartier = quartier;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numero;
		result = prime * result + ((quartier == null) ? 0 : quartier.hashCode());
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
		Cellule other = (Cellule) obj;
		if (numero != other.numero)
			return false;
		if (quartier == null) {
			if (other.quartier != null)
				return false;
		} else if (!quartier.equals(other.quartier))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cellule [quartier=" + quartier + ", numero=" + numero + "]";
	} 
	
	

}
