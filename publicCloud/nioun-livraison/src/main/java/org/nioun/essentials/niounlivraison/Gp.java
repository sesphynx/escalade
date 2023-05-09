package org.nioun.essentials.niounlivraison;

import javax.persistence.Entity;

@Entity
public class Gp {
	
	
	private String numtel;
	private String mail;
	private String organisation;

	


	public String getNumtel() {
		return numtel;
	}

	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((numtel == null) ? 0 : numtel.hashCode());
		result = prime * result + ((organisation == null) ? 0 : organisation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gp other = (Gp) obj;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (numtel == null) {
			if (other.numtel != null)
				return false;
		} else if (!numtel.equals(other.numtel))
			return false;
		if (organisation == null) {
			if (other.organisation != null)
				return false;
		} else if (!organisation.equals(other.organisation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gp [numtel=" + numtel + ", mail=" + mail + ", organisation=" + organisation + "]";
	}

		
	

}
