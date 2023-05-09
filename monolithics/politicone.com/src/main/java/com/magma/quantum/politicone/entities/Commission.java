package com.magma.quantum.politicone.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commission extends Entite {

	@ManyToOne
	@JoinColumn(name="regionId")
	public Region region ;
	public int numero ;
	
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
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
		Commission other = (Commission) obj;
		if (numero != other.numero)
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
		return "Commission [region=" + region + ", numero=" + numero + "]";
	} 
	
	
}
