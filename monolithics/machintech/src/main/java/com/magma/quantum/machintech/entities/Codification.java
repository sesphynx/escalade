package com.magma.quantum.machintech.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Entity
public class Codification extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user ;
	@OneToOne
	private Prospect prospect ;
	private String dateCodif ;
	private String typeCodif ;
	
	
	/**
	 * 
	 */
	public Codification() {
	}
	/**
	 * @param user
	 * @param prospect
	 * @param dateCodif
	 * @param typeCodif
	 */
	public Codification(User user, Prospect prospect, String dateCodif, String typeCodif) {
		super();
		this.user = user;
		this.prospect = prospect;
		this.dateCodif = dateCodif;
		this.typeCodif = typeCodif;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the prospect
	 */
	public Prospect getProspect() {
		return prospect;
	}
	/**
	 * @param prospect the prospect to set
	 */
	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}
	/**
	 * @return the dateCodif
	 */
	public String getDateCodif() {
		return dateCodif;
	}
	/**
	 * @param dateCodif the dateCodif to set
	 */
	public void setDateCodif(String dateCodif) {
		this.dateCodif = dateCodif;
	}
	/**
	 * @return the typeCodif
	 */
	public String getTypeCodif() {
		return typeCodif;
	}
	/**
	 * @param typeCodif the typeCodif to set
	 */
	public void setTypeCodif(String typeCodif) {
		this.typeCodif = typeCodif;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateCodif == null) ? 0 : dateCodif.hashCode());
		result = prime * result + ((prospect == null) ? 0 : prospect.hashCode());
		result = prime * result + ((typeCodif == null) ? 0 : typeCodif.hashCode());
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
		Codification other = (Codification) obj;
		if (dateCodif == null) {
			if (other.dateCodif != null)
				return false;
		} else if (!dateCodif.equals(other.dateCodif))
			return false;
		if (prospect == null) {
			if (other.prospect != null)
				return false;
		} else if (!prospect.equals(other.prospect))
			return false;
		if (typeCodif == null) {
			if (other.typeCodif != null)
				return false;
		} else if (!typeCodif.equals(other.typeCodif))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Codification [  dateCodif=" + dateCodif + ", typeCodif="
				+ typeCodif + "]";
	} 
	
	
	

}
