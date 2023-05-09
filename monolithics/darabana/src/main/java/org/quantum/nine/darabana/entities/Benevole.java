package org.quantum.nine.darabana.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Benevole extends AbstractEntity {
	
	public String nom ;
	public String prenom ;
	public String email ;
	public String addresse ;
	@ManyToOne
	@JoinColumn(name="communeId")
	public Commune commune ;
	@ManyToOne
	@JoinColumn(name = "ascId")
	public Asc asc ;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	
	
	public Asc getAsc() {
		return asc;
	}
	public void setAsc(Asc asc) {
		this.asc = asc;
	}
	
	@Override
	public String toString() {
		return "Benevole [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", addresse=" + addresse
				+ ", commune=" + commune + ", asc=" + asc + "]";
	}
	
	
	

}
