package org.nioun.essentials.niountransport;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Voiture extends AbstractEntity {

	
public String 	matricule ;

public String 	marque ;

public String annee ;

public String pays ;

public String usage ; 

public int kilometrage ;

@OneToMany(mappedBy="voiture")
public List<BailVoiture> bailVoitures ; 

@OneToMany(mappedBy="voiture")
public List<Voiturage> voiturages ; 

/**
/**
 * @return the matricule
 */
public String getMatricule() {
	return matricule;
}
/**
 * @param matricule the matricule to set
 */
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
/**
 * @return the marque
 */
public String getMarque() {
	return marque;
}
/**
 * @param marque the marque to set
 */
public void setMarque(String marque) {
	this.marque = marque;
}
/**
 * @return the annee
 */
public String getAnnee() {
	return annee;
}
/**
 * @param annee the annee to set
 */
public void setAnnee(String annee) {
	this.annee = annee;
}
/**
 * @return the pays
 */
public String getPays() {
	return pays;
}
/**
 * @param pays the pays to set
 */
public void setPays(String pays) {
	this.pays = pays;
}
/**
 * @return the usage
 */
public String getUsage() {
	return usage;
}
/**
 * @param usage the usage to set
 */
public void setUsage(String usage) {
	this.usage = usage;
}
/**
 * @return the kilometrage
 */
public int getKilometrage() {
	return kilometrage;
}
/**
 * @param kilometrage the kilometrage to set
 */
public void setKilometrage(int kilometrage) {
	this.kilometrage = kilometrage;
}



public List<BailVoiture> getBailVoitures() {
	return bailVoitures;
}
public void setBailVoitures(List<BailVoiture> bailVoitures) {
	this.bailVoitures = bailVoitures;
}
public List<Voiturage> getVoiturages() {
	return voiturages;
}
public void setVoiturages(List<Voiturage> voiturages) {
	this.voiturages = voiturages;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((annee == null) ? 0 : annee.hashCode());
	result = prime * result + ((bailVoitures == null) ? 0 : bailVoitures.hashCode());
	result = prime * result + kilometrage;
	result = prime * result + ((marque == null) ? 0 : marque.hashCode());
	result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
	result = prime * result + ((pays == null) ? 0 : pays.hashCode());
	result = prime * result + ((usage == null) ? 0 : usage.hashCode());
	result = prime * result + ((voiturages == null) ? 0 : voiturages.hashCode());
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
	Voiture other = (Voiture) obj;
	if (annee == null) {
		if (other.annee != null)
			return false;
	} else if (!annee.equals(other.annee))
		return false;
	if (bailVoitures == null) {
		if (other.bailVoitures != null)
			return false;
	} else if (!bailVoitures.equals(other.bailVoitures))
		return false;
	if (kilometrage != other.kilometrage)
		return false;
	if (marque == null) {
		if (other.marque != null)
			return false;
	} else if (!marque.equals(other.marque))
		return false;
	if (matricule == null) {
		if (other.matricule != null)
			return false;
	} else if (!matricule.equals(other.matricule))
		return false;
	if (pays == null) {
		if (other.pays != null)
			return false;
	} else if (!pays.equals(other.pays))
		return false;
	if (usage == null) {
		if (other.usage != null)
			return false;
	} else if (!usage.equals(other.usage))
		return false;
	if (voiturages == null) {
		if (other.voiturages != null)
			return false;
	} else if (!voiturages.equals(other.voiturages))
		return false;
	return true;
}
@Override
public String toString() {
	return "Voiture [matricule=" + matricule + ", marque=" + marque + ", annee=" + annee + ", pays=" + pays + ", usage="
			+ usage + ", kilometrage=" + kilometrage + ", bailVoitures=" + bailVoitures + ", voiturages=" + voiturages
			+ "]";
}




}
