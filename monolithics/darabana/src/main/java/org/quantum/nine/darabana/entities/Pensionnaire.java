package org.quantum.nine.darabana.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Pensionnaire extends AbstractEntity {
	
	public String nom ;
	public String prenom ;	
	
	@ManyToOne
	@JoinColumn(name="daaraId")
	public Daara daara ;
	
	@ManyToMany
	public List<MedicalAct> medicalActs ;
	
	@ManyToMany
	public List<Parent> parents ;
	
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
	
	public Daara getDaara() {
		return daara;
	}
	public void setDaara(Daara daara) {
		this.daara = daara;
	}
	
	
	public List<MedicalAct> getMedicalActs() {
		return medicalActs;
	}
	public void setMedicalActs(List<MedicalAct> medicalActs) {
		this.medicalActs = medicalActs;
	}
	
	
	public List<Parent> getParents() {
		return parents;
	}
	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
	@Override
	public String toString() {
		return "Pensionnaire [nom=" + nom + ", prenom=" + prenom + ", daara=" + daara + ", medicalActs=" + medicalActs +" , parents=" + parents + "]";
	}
	
	

}
