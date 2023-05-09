package org.nioun.essentials.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Faiseur extends User{
	
	@ManyToOne
	@JoinColumn(name="filiereId")
	public Filiere filiere ;
	
	@ManyToMany
	public List<Intervention> interventions ;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public List<Intervention> getInterventions() {
		return interventions;
	}

	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}

	
	
	
}
