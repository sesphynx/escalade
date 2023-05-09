package com.magma.quantum.politicone.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;


@Entity
public class  Entite extends AbstractEntity{
	
	public String nom ;
	
	public String envergure ;
	
	@ManyToMany(fetch= FetchType.LAZY ,mappedBy="entites")
	List<User> users ;
	
	public String getNom() {
		return nom;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEnvergure() {
		return envergure;
	}
	public void setEnvergure(String envergure) {
		this.envergure = envergure;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((envergure == null) ? 0 : envergure.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Entite other = (Entite) obj;
		if (envergure == null) {
			if (other.envergure != null)
				return false;
		} else if (!envergure.equals(other.envergure))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Entite [nom=" + nom + ", envergure=" + envergure + ", users=" + users + "]";
	}
	
	

}
