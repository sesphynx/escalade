package org.nioun.essentials.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BailLogis extends Bail {
	
	@ManyToOne
	@JoinColumn(name="logisId")
	public Logis logis ;
	
	public int prix ;

	public Logis getLogis() {
		return logis;
	}

	public void setLogis(Logis logis) {
		this.logis = logis;
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
		result = prime * result + ((logis == null) ? 0 : logis.hashCode());
		result = prime * result + prix;
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
		BailLogis other = (BailLogis) obj;
		if (logis == null) {
			if (other.logis != null)
				return false;
		} else if (!logis.equals(other.logis))
			return false;
		if (prix != other.prix)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BailLogis [logis=" + logis + ", prix=" + prix + "]";
	}

	
	

}
