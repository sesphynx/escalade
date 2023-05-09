package org.quantum.nine.darabana.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class MedicalAct extends AbstractEntity {

	@OneToMany(mappedBy="medicalAct")
	public List<MedicalActor> medicalActors ;
	
	@OneToMany
	@JoinColumn(name="medicalActId")
	public List<Daara> daaras ;
	
	public int nbreVisites;
	
	@ManyToMany
	public List<Pensionnaire> pensionnairesVisites ;
	
	
	public List<MedicalActor> getMedicalActors() {
		return medicalActors;
	}
	public void setMedicalActors(List<MedicalActor> medicalActors) {
		this.medicalActors = medicalActors;
	}
	public List<Daara> getDaaras() {
		return daaras;
	}
	public void setDaaras(List<Daara> daaras) {
		this.daaras = daaras;
	}
	
	public int getNbreVisites() {
		return nbreVisites;
	}
	public void setNbreVisites(int nbreVisites) {
		this.nbreVisites = nbreVisites;
	}
	public List<Pensionnaire> getPensionnairesVisites() {
		return pensionnairesVisites;
	}
	public void setPensionnairesVisites(List<Pensionnaire> pensionnairesVisites) {
		this.pensionnairesVisites = pensionnairesVisites;
	}
	@Override
	public String toString() {
		return "MedicalAct [medicalActors=" + medicalActors + ", daaras=" + daaras + ", nbreVisites=" + nbreVisites
				+ ", pensionnairesVisites=" + pensionnairesVisites + "]";
	}
	
	
	
	
}
