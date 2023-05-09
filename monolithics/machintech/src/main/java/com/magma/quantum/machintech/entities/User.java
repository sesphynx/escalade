package com.magma.quantum.machintech.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel(description="utilisateur intra systéme ")
public class User extends AbstractEntity {
	
	@ApiModelProperty(notes="nom utilisateur")
	private String nom ;
	
	@ApiModelProperty(notes="prenom utilisateur")
	private String prenom ;
	
	@ApiModelProperty(notes="mot de passe utilisateur")
	private String password ;
	
	@ApiModelProperty(notes="addresse utilisateur")
	private String addresse ;
	
	@ApiModelProperty(notes="numero telephone utilisateur")
	private String numeroTel ;
	
	@ApiModelProperty(notes="email utilisateur")
	private String email ;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="groupeId")
	@ApiModelProperty(notes="groupe utilisateur")
	private Groupe groupe ;
	
	@OneToOne(mappedBy="user")
	@ApiModelProperty(notes="role utilisateur")
	private Role role ;
	
	
	/**
	 * 
	 */
	public User() {
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param password
	 * @param addresse
	 * @param numeroTel
	 * @param email
	 * @param groupe
	 * @param role
	 */
	public User(String nom, String prenom, String password, String addresse, String numeroTel, String email,
			Groupe groupe, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.addresse = addresse;
		this.numeroTel = numeroTel;
		this.email = email;
		this.groupe = groupe;
		this.role = role;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the numeroTel
	 */
	public String getNumeroTel() {
		return numeroTel;
	}
	/**
	 * @param numeroTel the numeroTel to set
	 */
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	/**
	 * @return the roles
	 */
	
	public Role getRole() {
		return role;
	}
	
	/**
	 * @param roles the roles to set
	 */
	public void setRole(Role role) {
		this.role= role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((groupe == null) ? 0 : groupe.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numeroTel == null) ? 0 : numeroTel.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		User other = (User) obj;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (groupe == null) {
			if (other.groupe != null)
				return false;
		} else if (!groupe.equals(other.groupe))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numeroTel == null) {
			if (other.numeroTel != null)
				return false;
		} else if (!numeroTel.equals(other.numeroTel))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", addresse=" + addresse
				+ ", numeroTel=" + numeroTel + ", email=" + email + ", role=" + role + "]";
	}
	
	
	
	
	
}
