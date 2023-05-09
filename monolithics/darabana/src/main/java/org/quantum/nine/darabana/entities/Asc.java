package org.quantum.nine.darabana.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Asc extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="communeId")
	public Commune commune ;
	
	public String nom;
	
	public String typeParrainage ;
	
	@OneToMany(mappedBy="asc")
	public List<Benevole> benevoles;
	
	
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTypeParrainage() {
		return typeParrainage;
	}
	public void setTypeParrainage(String typeParrainage) {
		this.typeParrainage = typeParrainage;
	}
	public List<Benevole> getBenevoles() {
		return benevoles;
	}
	public void setBenevoles(List<Benevole> benevoles) {
		this.benevoles = benevoles;
	}
	@Override
	public String toString() {
		return "Asc [commune=" + commune + ", nom=" + nom + ", typeParrainage=" + typeParrainage + ", benevoles="
				+ benevoles + "]";
	} 
	
	
	
}
