package org.quantum.nine.darabana.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Parent extends AbstractEntity {
	
	public String nom ;
	public String prenom ;
	public String email ;
	public String addresse ;
	
	@ManyToMany
	public List<Pensionnaire> pensionnaires ;
	
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
	public List<Pensionnaire> getPensionnaires() {
		return pensionnaires;
	}
	public void setPensionnaires(List<Pensionnaire> pensionnaires) {
		this.pensionnaires = pensionnaires;
	}
	@Override
	public String toString() {
		return "Parent [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", addresse=" + addresse + ", pensionnaires="
				+ pensionnaires + "]";
	}
	
	
	

}
