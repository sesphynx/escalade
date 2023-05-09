package org.quantum.nine.darabana.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Parrain extends AbstractEntity {
	
	
	public String nom ;
	public String prenom ;
	public String email ;
	public String addresse ;
	public Date duree ;
	public String typeParrainage ;
	public int montant ;
	public String descriptif ;
	
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
	public Date getDuree() {
		return duree;
	}
	public void setDuree(Date duree) {
		this.duree = duree;
	}
	public String getTypeParrainage() {
		return typeParrainage;
	}
	public void setTypeParrainage(String typeParrainage) {
		this.typeParrainage = typeParrainage;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	@Override
	public String toString() {
		return "Parrain [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", addresse=" + addresse + ", duree="
				+ duree + ", typeParrainage=" + typeParrainage + ", montant=" + montant + ", descriptif=" + descriptif
				+ "]";
	}
	
	
	 
	
	

}
