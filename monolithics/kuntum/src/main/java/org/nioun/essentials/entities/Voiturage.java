package org.nioun.essentials.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Voiturage extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="voitureId")
	public Voiture  voiture ;
	
	@ManyToMany
	public List<Client> clients ;
	
	public Addresse depart ;
	
	public Addresse arrivee;
	
	public Date heureDepart ;

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Addresse getDepart() {
		return depart;
	}

	public void setDepart(Addresse depart) {
		this.depart = depart;
	}

	public Addresse getArrivee() {
		return arrivee;
	}

	public void setArrivee(Addresse arrivee) {
		this.arrivee = arrivee;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((arrivee == null) ? 0 : arrivee.hashCode());
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result + ((depart == null) ? 0 : depart.hashCode());
		result = prime * result + ((heureDepart == null) ? 0 : heureDepart.hashCode());
		result = prime * result + ((voiture == null) ? 0 : voiture.hashCode());
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
		Voiturage other = (Voiturage) obj;
		if (arrivee == null) {
			if (other.arrivee != null)
				return false;
		} else if (!arrivee.equals(other.arrivee))
			return false;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		if (depart == null) {
			if (other.depart != null)
				return false;
		} else if (!depart.equals(other.depart))
			return false;
		if (heureDepart == null) {
			if (other.heureDepart != null)
				return false;
		} else if (!heureDepart.equals(other.heureDepart))
			return false;
		if (voiture == null) {
			if (other.voiture != null)
				return false;
		} else if (!voiture.equals(other.voiture))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voiturage [voiture=" + voiture + ", clients=" + clients + ", depart=" + depart + ", arrivee=" + arrivee
				+ ", heureDepart=" + heureDepart + "]";
	}
	 
	
	
}
