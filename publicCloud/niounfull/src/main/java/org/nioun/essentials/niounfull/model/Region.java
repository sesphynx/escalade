package org.nioun.essentials.niounfull.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Region extends AbstractEntity{

@ManyToOne
@JoinColumn(name="paysId")
public 	Pays pays ;

public String nom ;

@OneToMany(mappedBy="region")
public List<Ville> villes ;

@OneToMany(mappedBy="region")
public List<Departement> departements ;

@OneToMany(mappedBy="region")
public List<Commission> commissions ;

public Pays getPays() {
	return pays;
}

public void setPays(Pays pays) {
	this.pays = pays;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public List<Ville> getVilles() {
	return villes;
}

public void setVilles(List<Ville> villes) {
	this.villes = villes;
}

public List<Departement> getDepartements() {
	return departements;
}

public void setDepartements(List<Departement> departements) {
	this.departements = departements;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((commissions == null) ? 0 : commissions.hashCode());
	result = prime * result + ((departements == null) ? 0 : departements.hashCode());
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((pays == null) ? 0 : pays.hashCode());
	result = prime * result + ((villes == null) ? 0 : villes.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Region other = (Region) obj;
	if (commissions == null) {
		if (other.commissions != null)
			return false;
	} else if (!commissions.equals(other.commissions))
		return false;
	if (departements == null) {
		if (other.departements != null)
			return false;
	} else if (!departements.equals(other.departements))
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (pays == null) {
		if (other.pays != null)
			return false;
	} else if (!pays.equals(other.pays))
		return false;
	if (villes == null) {
		if (other.villes != null)
			return false;
	} else if (!villes.equals(other.villes))
		return false;
	return true;
}

@Override
public String toString() {
	return "Region [pays=" + pays + ", nom=" + nom + ", villes=" + villes + ", departements=" + departements
			+ ", commissions=" + commissions + "]";
}




}
