package com.magma.quantum.machintech.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity

@ApiModel(description="Objet -Absence- pour éditer les présences ,réservé aux SUPERVISEURS/MANAGERS")
public class Absence extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name="userId")
	@ApiModelProperty(notes="Utilisateur absent")
	private User user ;
	
	@ApiModelProperty(notes="Date absence ")
	private Date dateAbsence ;
	
	/**
	 * Constructeur à vide d'absence
	 */
	public Absence() {
	}
	
	/**
	 * @param user
	 * @param dateAbsence
	 */
	public Absence(User user, Date dateAbsence) {
		this.user = user;
		this.dateAbsence = dateAbsence;
	}

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateAbsence == null) ? 0 : dateAbsence.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Absence other = (Absence) obj;
		if (dateAbsence == null) {
			if (other.dateAbsence != null)
				return false;
		} else if (!dateAbsence.equals(other.dateAbsence))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public Date getDateAbsence() {
		return dateAbsence;
	}
	public void setDateAbsence(Date dateAbsence) {
		this.dateAbsence = dateAbsence;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbsenceService [user=" + user + ", dateAbsence=" + dateAbsence + "]";
	}


}
