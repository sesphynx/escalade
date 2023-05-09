package org.nioun.essentials.niounsocial;

import org.nioun.essentials.niouncore.Filiere;

public class Chapiteau extends Cercle {
	
	public Filiere filiere ;
	
	public String portee ;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public String getPortee() {
		return portee;
	}

	public void setPortee(String portee) {
		this.portee = portee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
		result = prime * result + ((portee == null) ? 0 : portee.hashCode());
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
		Chapiteau other = (Chapiteau) obj;
		if (filiere == null) {
			if (other.filiere != null)
				return false;
		} else if (!filiere.equals(other.filiere))
			return false;
		if (portee == null) {
			if (other.portee != null)
				return false;
		} else if (!portee.equals(other.portee))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chapiteau [filiere=" + filiere + ", portee=" + portee + "]";
	}
	
	
}
