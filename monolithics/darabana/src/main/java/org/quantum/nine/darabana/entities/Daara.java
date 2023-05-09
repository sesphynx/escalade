package org.quantum.nine.darabana.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Daara extends AbstractEntity {
	
@OneToOne(cascade = CascadeType.ALL)
public Localisation localisation ;


@OneToMany(mappedBy="daara")
public List<Pensionnaire> pensionnaires ;

public Integer nbreEnfants ;
public int nbrePieces ;
public String couvertureMedicale ;
public String nom ;

public Localisation getLocalisation() {
	return localisation;
}
public void setLocalisation(Localisation localisation) {
	this.localisation = localisation;
}



public List<Pensionnaire> getPensionnaires() {
	return pensionnaires;
}
public void setPensionnaires(List<Pensionnaire> pensionnaires) {
	this.pensionnaires = pensionnaires;
}
public Integer getNbreEnfants() {
	return nbreEnfants;
}
public void setNbreEnfants(Integer nbreEnfants) {
	this.nbreEnfants = nbreEnfants;
}
public int getNbrePieces() {
	return nbrePieces;
}
public void setNbrePieces(int nbrePieces) {
	this.nbrePieces = nbrePieces;
}

public String getCouvertureMedicale() {
	return couvertureMedicale;
}
public void setCouvertureMedicale(String couvertureMedicale) {
	this.couvertureMedicale = couvertureMedicale;
}



public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((couvertureMedicale == null) ? 0 : couvertureMedicale.hashCode());
	result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
	result = prime * result + ((nbreEnfants == null) ? 0 : nbreEnfants.hashCode());
	result = prime * result + nbrePieces;
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((pensionnaires == null) ? 0 : pensionnaires.hashCode());
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
	Daara other = (Daara) obj;
	if (couvertureMedicale == null) {
		if (other.couvertureMedicale != null)
			return false;
	} else if (!couvertureMedicale.equals(other.couvertureMedicale))
		return false;
	if (localisation == null) {
		if (other.localisation != null)
			return false;
	} else if (!localisation.equals(other.localisation))
		return false;
	if (nbreEnfants == null) {
		if (other.nbreEnfants != null)
			return false;
	} else if (!nbreEnfants.equals(other.nbreEnfants))
		return false;
	if (nbrePieces != other.nbrePieces)
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (pensionnaires == null) {
		if (other.pensionnaires != null)
			return false;
	} else if (!pensionnaires.equals(other.pensionnaires))
		return false;
	return true;
}
@Override
public String toString() {
	return "Daara [localisation=" + localisation + ", pensionnaires=" + pensionnaires + ", nbreEnfants=" + nbreEnfants
			+ ", nbrePieces=" + nbrePieces + ", couvertureMedicale=" + couvertureMedicale + ", nom=" + nom + "]";
}
}