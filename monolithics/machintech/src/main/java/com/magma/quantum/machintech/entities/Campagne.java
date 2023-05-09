package com.magma.quantum.machintech.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description=" Campagne de prospection enregistrée ")
public class Campagne extends AbstractEntity{
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="operateurId")
	@ApiModelProperty(notes="Operateur responsable ded campagne")
	private  Operateur operateur ;
	
	@ApiModelProperty(notes="Nature de campagne - conquête , reconduction-")
	private String nature ;
	
	@ApiModelProperty(notes="Date Debut de Campagne")
	private  Date dateDebut ;
	
	@ApiModelProperty(notes="Date Fin de campagne ")
	private Date dateFin;
		
	/**
	 * 
	 */
	public Campagne() {
	}
	
	
	
	/**
	 * @param operateur
	 * @param nature
	 * @param dateDebut
	 * @param dateFin
	 */
	public Campagne(Operateur operateur, String nature, Date dateDebut, Date dateFin) {
		this.operateur = operateur;
		this.nature = nature;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}



	/**
	 * @return the operateur
	 */
	public Operateur getOperateur() {
		return operateur;
	}
	/**
	 * @param operateur the operateur to set
	 */
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
	/**
	 * @return the nature
	 */
	public String getNature() {
		return nature;
	}
	/**
	 * @param nature the nature to set
	 */
	public void setNature(String nature) {
		this.nature = nature;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime * result + ((nature == null) ? 0 : nature.hashCode());
		result = prime * result + ((operateur == null) ? 0 : operateur.hashCode());
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
		Campagne other = (Campagne) obj;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		if (nature == null) {
			if (other.nature != null)
				return false;
		} else if (!nature.equals(other.nature))
			return false;
		if (operateur == null) {
			if (other.operateur != null)
				return false;
		} else if (!operateur.equals(other.operateur))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Campagne [operateur=" + operateur + ", nature=" + nature + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}
	
	

}
