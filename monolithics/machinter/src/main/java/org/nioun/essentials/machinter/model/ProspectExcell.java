package org.nioun.essentials.machinter.model;

import javax.persistence.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Prospect à démarcher et codifier")
public class ProspectExcell extends AbstractEntity {
	
	

	
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
	
	
	
	
	/**
	 * 
	 */
	public ProspectExcell() {
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
	public ProspectExcell( String addresse, String nom, String prenom, String mail, String numeroM,
			String numeroF) {
		this.addresse = addresse;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.numeroM = numeroM;
		this.numeroF = numeroF;
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
	public String toString() {
		return "ProspectExcell [addresse=" + addresse + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", numeroM=" + numeroM + ", numeroF=" + numeroF + "]";
	}

	
	
	
	
	

}
