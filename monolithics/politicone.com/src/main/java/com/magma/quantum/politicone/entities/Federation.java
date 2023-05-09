package com.magma.quantum.politicone.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Federation extends Entite {
	
	@OneToMany(mappedBy="federation")
	public List<Pays> payss ;
	
	
	public String numero ;
	
	public String nom ;
	
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Pays> getPayss() {
		return payss;
	}
	public void setPayss(List<Pays> payss) {
		this.payss = payss;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((payss == null) ? 0 : payss.hashCode());
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
		Federation other = (Federation) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (payss == null) {
			if (other.payss != null)
				return false;
		} else if (!payss.equals(other.payss))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Federation [payss=" + payss + ", numero=" + numero + ", nom=" + nom + "]";
	}
	
	

}
