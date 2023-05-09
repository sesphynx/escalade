package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Intervention extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name="addresseId")
	public Addresse addresse ;
	
	@ManyToOne
	@JoinColumn(name="clientId")
	public Client client ;
	
	@ManyToOne
	@JoinColumn(name="filiereId")
	public Filiere filiere ;
	
	public String descriptif ;
	
	@ManyToMany
	public List<Faiseur> faiseurs ;
	
	public Addresse getAddresse() {
		return addresse;
	}
	public void setAddresse(Addresse addresse) {
		this.addresse = addresse;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	
	public List<Faiseur> getFaiseurs() {
		return faiseurs;
	}
	public void setFaiseurs(List<Faiseur> faiseurs) {
		this.faiseurs = faiseurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
		result = prime * result + ((faiseurs == null) ? 0 : faiseurs.hashCode());
		result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
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
		Intervention other = (Intervention) obj;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (faiseurs == null) {
			if (other.faiseurs != null)
				return false;
		} else if (!faiseurs.equals(other.faiseurs))
			return false;
		if (filiere == null) {
			if (other.filiere != null)
				return false;
		} else if (!filiere.equals(other.filiere))
			return false;
		return true;
	}
	

	
	@Override
	public String toString() {
		return "Intervention [addresse=" + addresse + ", client=" + client + ", filiere=" + filiere + ", descriptif="
				+ descriptif + ", faiseurs=" + faiseurs + "]";
	}

}
