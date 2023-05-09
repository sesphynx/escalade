package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Promoteur extends User{
	
	@OneToMany(mappedBy="promoteur")
	public List<Projet> projets ;

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((projets == null) ? 0 : projets.hashCode());
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
		Promoteur other = (Promoteur) obj;
		if (projets == null) {
			if (other.projets != null)
				return false;
		} else if (!projets.equals(other.projets))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Promoteur [projets=" + projets + "]";
	}
	
	

}
