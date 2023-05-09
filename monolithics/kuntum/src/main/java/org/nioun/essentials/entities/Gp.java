package org.nioun.essentials.entities;

import javax.persistence.Entity;

@Entity
public class Gp extends User {
	
	
	private Addresse addresse;
	private String numtel;
	private String mail;
	private String organisation;

	

	public Addresse getAddresse() {
		return addresse;
	}

	public void setAddresse(Addresse addresse) {
		this.addresse = addresse;
	}

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
		int result = super.hashCode();
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((numtel == null) ? 0 : numtel.hashCode());
		result = prime * result + ((organisation == null) ? 0 : organisation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Gp))
			return false;
		Gp other = (Gp) obj;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
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
		return "Gp [addresse=" + addresse + ", numtel=" + numtel + ", mail=" + mail + ", organisation=" + organisation
				+ "]";
	}



	
	

}
