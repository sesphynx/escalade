package org.quantum.nine.darabana.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Localisation extends AbstractEntity {

	public String region ;
	
	@OneToOne(mappedBy="localisation")
	public Daara daara;
	
	@ManyToOne
	@JoinColumn(name="communeId")
	public Commune commune ;
	
	public String quartier ;
	public String addresse ;
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public Daara getDaara() {
		return daara;
	}
	public void setDaara(Daara daara) {
		this.daara = daara;
	}
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	@Override
	public String toString() {
		return  region ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((commune == null) ? 0 : commune.hashCode());
		result = prime * result + ((daara == null) ? 0 : daara.hashCode());
		result = prime * result + ((quartier == null) ? 0 : quartier.hashCode());
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
		Localisation other = (Localisation) obj;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
		if (commune == null) {
			if (other.commune != null)
				return false;
		} else if (!commune.equals(other.commune))
			return false;
		if (daara == null) {
			if (other.daara != null)
				return false;
		} else if (!daara.equals(other.daara))
			return false;
		if (quartier == null) {
			if (other.quartier != null)
				return false;
		} else if (!quartier.equals(other.quartier))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}
	
	
	
}
