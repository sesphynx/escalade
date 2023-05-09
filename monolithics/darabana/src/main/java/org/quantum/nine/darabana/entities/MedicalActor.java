package org.quantum.nine.darabana.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MedicalActor extends AbstractEntity {
	public String nom ;
	public String prenom ;
	public String email ;
	public String addresse ;
	
	@ManyToOne
	@JoinColumn(name="medicalActId")
	public MedicalAct medicalAct ;
	
	@Override
	public String toString() {
		return "MedicalActor [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", addresse=" + addresse
				+ ", medicalAct=" + medicalAct + "]";
	}
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
	public MedicalAct getMedicalAct() {
		return medicalAct;
	}
	public void setMedicalAct(MedicalAct medicalAct) {
		this.medicalAct = medicalAct;
	}
	
	
	
	

}
