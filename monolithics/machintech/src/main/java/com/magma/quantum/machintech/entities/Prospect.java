package com.magma.quantum.machintech.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Prospect à démarcher et codifier")
public class Prospect extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name = "prospectusId")
	@JsonIgnore
	@ApiModelProperty(notes="Prospectus parent regroupant un ensemble de prospects")
	private Prospectus prospectus;

	@ApiModelProperty(notes="addresse du prospect")
	private String addresse ;

	@ApiModelProperty(notes="nom du prospect")
	private String nom ;
	
	@ApiModelProperty(notes="prenom du prospect")
	private String prenom ;
	@ApiModelProperty(notes="mail du prospect")
	private String mail ;
	@ApiModelProperty(notes="numero telephone mobile du prospect")
	private String numeroM;
	@ApiModelProperty(notes="numero telephone fixe du prospect")
	private String numeroF;
	@OneToOne
	@ApiModelProperty(notes="")
	private Codification codification ;
	
	
	
	/**
	 * 
	 */
	public Prospect() {
	}
		
	/**
	 * @param prospectus
	 * @param addresse
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param numeroM
	 * @param numeroF
	 */
	public Prospect(Prospectus prospectus, String addresse, String nom, String prenom, String mail, String numeroM,
			String numeroF) {
		this.prospectus = prospectus;
		this.addresse = addresse;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.numeroM = numeroM;
		this.numeroF = numeroF;
	}


	/**
	 * @return the prospectus
	 */
	public Prospectus getProspectus() {
		return prospectus;
	}
	/**
	 * @param prospectus the prospectus to set
	 */
	@ManyToOne
	@JoinColumn(name="prospectId")
	public void setProspectus(Prospectus prospectus) {
		this.prospectus = prospectus;
	}
	/**
	 * @return the addresse
	 */
	public String getAddresse() {
		return addresse;
	}
	/**
	 * @param addresse the addresse to set
	 */
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the numeroM
	 */
	public String getNumeroM() {
		return numeroM;
	}
	/**
	 * @param numeroM the numeroM to set
	 */
	public void setNumeroM(String numeroM) {
		this.numeroM = numeroM;
	}
	/**
	 * @return the numeroF
	 */
	public String getNumeroF() {
		return numeroF;
	}
	/**
	 * @param numeroF the numeroF to set
	 */
	public void setNumeroF(String numeroF) {
		this.numeroF = numeroF;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numeroF == null) ? 0 : numeroF.hashCode());
		result = prime * result + ((numeroM == null) ? 0 : numeroM.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((prospectus == null) ? 0 : prospectus.hashCode());
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
		Prospect other = (Prospect) obj;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numeroF == null) {
			if (other.numeroF != null)
				return false;
		} else if (!numeroF.equals(other.numeroF))
			return false;
		if (numeroM == null) {
			if (other.numeroM != null)
				return false;
		} else if (!numeroM.equals(other.numeroM))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (prospectus == null) {
			if (other.prospectus != null)
				return false;
		} else if (!prospectus.equals(other.prospectus))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Prospect [addresse=" + addresse + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", numeroM=" + numeroM + ", numeroF=" + numeroF + "]";
	}
	
	
	

}
