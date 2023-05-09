package org.nioun.essentials.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dividende extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="projetId")
	public Projet projet ;
	
	public int valeur;
	
	public String devise ;
	
	public int total ;

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
		result = prime * result + ((projet == null) ? 0 : projet.hashCode());
		result = prime * result + total;
		result = prime * result + valeur;
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
		Dividende other = (Dividende) obj;
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		if (projet == null) {
			if (other.projet != null)
				return false;
		} else if (!projet.equals(other.projet))
			return false;
		if (total != other.total)
			return false;
		if (valeur != other.valeur)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dividende [projet=" + projet + ", valeur=" + valeur + ", devise=" + devise + ", total=" + total + "]";
	}
	
	
}
