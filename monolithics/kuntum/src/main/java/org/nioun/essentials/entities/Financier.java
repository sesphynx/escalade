/**
 * 
 */
package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * @author user
 *
 */
@Entity
public class Financier extends User {

	public int Solde ;
	public String devise ;
	
	@OneToMany(mappedBy="financier")
	public List<Acquisition> acquisitions ;

	public int getSolde() {
		return Solde;
	}

	public void setSolde(int solde) {
		Solde = solde;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Solde;
		result = prime * result + ((acquisitions == null) ? 0 : acquisitions.hashCode());
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
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
		Financier other = (Financier) obj;
		if (Solde != other.Solde)
			return false;
		if (acquisitions == null) {
			if (other.acquisitions != null)
				return false;
		} else if (!acquisitions.equals(other.acquisitions))
			return false;
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Financier [Solde=" + Solde + ", devise=" + devise + ", acquisitions=" + acquisitions + "]";
	}
	
	
	
	
}
