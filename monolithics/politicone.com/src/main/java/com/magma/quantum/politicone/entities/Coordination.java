package com.magma.quantum.politicone.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Coordination extends Entite {
	
	@OneToOne
	@JoinColumn(name="communeId")
	public Commune commune ; 
	
	public String numero ;
	
	
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((commune == null) ? 0 : commune.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Coordination other = (Coordination) obj;
		if (commune == null) {
			if (other.commune != null)
				return false;
		} else if (!commune.equals(other.commune))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Coordination [commune=" + commune + ", numero=" + numero + "]";
	}
	
	

}
