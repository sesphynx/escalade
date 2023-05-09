package org.quantum.nine.magma.corantic.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Surat extends AbstractEntity {
	
	private String nom ;
	private int nbreVersets ;
	
	@OneToMany(mappedBy="surat")
	private List<Versets> versets ; 
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbreVersets() {
		return nbreVersets;
	}
	public void setNbreVersets(int nbreVersets) {
		this.nbreVersets = nbreVersets;
	}
	public List<Versets> getVersets() {
		return versets;
	}
	public void setVersets(List<Versets> versets) {
		this.versets = versets;
	}
	
	
	
	

}
