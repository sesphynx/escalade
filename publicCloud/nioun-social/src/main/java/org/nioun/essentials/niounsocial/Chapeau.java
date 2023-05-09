package org.nioun.essentials.niounsocial;

import org.nioun.essentials.niouncore.Customer;
import org.nioun.essentials.niouncore.Filiere;

public class Chapeau extends Customer{
	
	public Filiere filiere ;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
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
		Chapeau other = (Chapeau) obj;
		if (filiere == null) {
			if (other.filiere != null)
				return false;
		} else if (!filiere.equals(other.filiere))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chapeau [filiere=" + filiere + "]";
	}
	
	
}
