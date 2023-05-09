package com.magma.quantum.machintech.entities;

import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Ensemble d'utilisateurs organisé en groupe de travail")
public class Groupe extends AbstractEntity {

@OneToMany(mappedBy="groupe",cascade = CascadeType.ALL)
@ApiModelProperty(notes="liste d'utilisateurs affectés")
private List<User> listUsers ;

@ApiModelProperty(notes="Nom/Désignation du groupe de travail ")
private String designation ; 

@ApiModelProperty(notes="Heure Début de shift")
private  Time heureSiege ; 

@ApiModelProperty(notes="Heure Descente de shift")
private  Time heureDescente;

/**
 * 
 */
public Groupe() {
}

/**
 * @param designation
 * @param heureSiege
 * @param heureDescente
 */
public Groupe(String designation, Time heureSiege, Time heureDescente) {
	this.designation = designation;
	this.heureSiege = heureSiege;
	this.heureDescente = heureDescente;
}

public List<User> getListUsers() {
	return listUsers;
}
public void setListUsers(List<User> listUsers) {
	this.listUsers = listUsers;
}
/**
 * @return the designation
 */
public String getDesignation() {
	return designation;
}
/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}
/**
 * @return the heureSiege
 */
public Time getHeureSiege() {
	return heureSiege;
}
/**
 * @param heureSiege the heureSiege to set
 */
public void setHeureSiege(Time heureSiege) {
	this.heureSiege = heureSiege;
}
/**
 * @return the heureDescente
 */
public Time getHeureDescente() {
	return heureDescente;
}
/**
 * @param heureDescente the heureDescente to set
 */
public void setHeureDescente(Time heureDescente) {
	this.heureDescente = heureDescente;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((designation == null) ? 0 : designation.hashCode());
	result = prime * result + ((heureDescente == null) ? 0 : heureDescente.hashCode());
	result = prime * result + ((heureSiege == null) ? 0 : heureSiege.hashCode());
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
	Groupe other = (Groupe) obj;
	if (designation == null) {
		if (other.designation != null)
			return false;
	} else if (!designation.equals(other.designation))
		return false;
	if (heureDescente == null) {
		if (other.heureDescente != null)
			return false;
	} else if (!heureDescente.equals(other.heureDescente))
		return false;
	if (heureSiege == null) {
		if (other.heureSiege != null)
			return false;
	} else if (!heureSiege.equals(other.heureSiege))
		return false;
	return true;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Groupe [designation=" + designation + ", heureSiege=" + heureSiege + ", heureDescente=" + heureDescente
			+ "]";
}


}
