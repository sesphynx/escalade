package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Bailleur extends User{
	
	@ManyToMany
	public List<Filiere> filieres ;
	
	@OneToMany(mappedBy="bailleur")
	public List<Voiture> vehicules ;
	
	@OneToMany(mappedBy="bailleur")
	public List<Logis>  logis ;
	
	@OneToMany(mappedBy="bailleur")
	public List<Bail>  bails ;

	

	public List<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}

	public List<Voiture> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Voiture> vehicules) {
		this.vehicules = vehicules;
	}

	public List<Logis> getLogis() {
		return logis;
	}

	public void setLogis(List<Logis> logis) {
		this.logis = logis;
	}

	public List<Bail> getBails() {
		return bails;
	}

	public void setBails(List<Bail> bails) {
		this.bails = bails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bails == null) ? 0 : bails.hashCode());
		result = prime * result + ((filieres == null) ? 0 : filieres.hashCode());
		result = prime * result + ((logis == null) ? 0 : logis.hashCode());
		result = prime * result + ((vehicules == null) ? 0 : vehicules.hashCode());
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
		Bailleur other = (Bailleur) obj;
		if (bails == null) {
			if (other.bails != null)
				return false;
		} else if (!bails.equals(other.bails))
			return false;
		if (filieres == null) {
			if (other.filieres != null)
				return false;
		} else if (!filieres.equals(other.filieres))
			return false;
		if (logis == null) {
			if (other.logis != null)
				return false;
		} else if (!logis.equals(other.logis))
			return false;
		if (vehicules == null) {
			if (other.vehicules != null)
				return false;
		} else if (!vehicules.equals(other.vehicules))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bailleur [filieres=" + filieres + ", vehicules=" + vehicules + ", logis=" + logis + ", bails=" + bails
				+ "]";
	}
	
	
	
	
	
}