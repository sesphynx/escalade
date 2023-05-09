package org.nioun.essentials.niountransport;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bail extends AbstractEntity{
	
	
	
	public Date dateDebut ;
	
	public Date dateFin ;
	
	public String uniteFacturation ;
	
	public String prixUnite ;
	
	
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getUniteFacturation() {
		return uniteFacturation;
	}
	public void setUniteFacturation(String uniteFacturation) {
		this.uniteFacturation = uniteFacturation;
	}
	public String getPrixUnite() {
		return prixUnite;
	}
	public void setPrixUnite(String prixUnite) {
		this.prixUnite = prixUnite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime * result + ((prixUnite == null) ? 0 : prixUnite.hashCode());
		result = prime * result + ((uniteFacturation == null) ? 0 : uniteFacturation.hashCode());
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
		Bail other = (Bail) obj;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		if (prixUnite == null) {
			if (other.prixUnite != null)
				return false;
		} else if (!prixUnite.equals(other.prixUnite))
			return false;
		if (uniteFacturation == null) {
			if (other.uniteFacturation != null)
				return false;
		} else if (!uniteFacturation.equals(other.uniteFacturation))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bail [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", uniteFacturation=" + uniteFacturation
				+ ", prixUnite=" + prixUnite + "]";
	}
	
}
