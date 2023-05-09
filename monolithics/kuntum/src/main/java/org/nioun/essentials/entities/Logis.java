package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Logis extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "bailleurId")
	public Bailleur bailleur;

	public String type;

	public String addresse;

	public String surface;

	public String descriptif;

	@OneToMany(mappedBy = "logis")
	public List<BailLogis> bailLogiss;

	
	
	public List<BailLogis> getBailLogiss() {
		return bailLogiss;
	}

	public void setBailLogiss(List<BailLogis> bailLogiss) {
		this.bailLogiss = bailLogiss;
	}

	public Bailleur getBailleur() {
		return bailleur;
	}

	public void setBailleur(Bailleur bailleur) {
		this.bailleur = bailleur;
	}

	

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the addresse
	 */
	public String getAddresse() {
		return addresse;
	}

	/**
	 * @param addresse the addresse to set
	 */
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	/**
	 * @return the surface
	 */
	public String getSurface() {
		return surface;
	}

	/**
	 * @param surface the surface to set
	 */
	public void setSurface(String surface) {
		this.surface = surface;
	}

	/**
	 * @return the descriptif
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * @param descriptif the descriptif to set
	 */
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((bailLogiss == null) ? 0 : bailLogiss.hashCode());
		result = prime * result + ((bailleur == null) ? 0 : bailleur.hashCode());
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
		result = prime * result + ((surface == null) ? 0 : surface.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Logis other = (Logis) obj;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
		if (bailLogiss == null) {
			if (other.bailLogiss != null)
				return false;
		} else if (!bailLogiss.equals(other.bailLogiss))
			return false;
		if (bailleur == null) {
			if (other.bailleur != null)
				return false;
		} else if (!bailleur.equals(other.bailleur))
			return false;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (surface == null) {
			if (other.surface != null)
				return false;
		} else if (!surface.equals(other.surface))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Logis [bailleur=" + bailleur + ", type=" + type + ", addresse=" + addresse + ", surface=" + surface
				+ ", descriptif=" + descriptif + ", bailLogiss=" + bailLogiss + "]";
	}
	
	

}
