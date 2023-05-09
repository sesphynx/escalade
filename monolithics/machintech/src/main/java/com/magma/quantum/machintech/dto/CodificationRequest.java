package com.magma.quantum.machintech.dto;

import java.util.Date;


public class CodificationRequest {
	Long  idProspect ;
	Long idUser ;
	private Date dateCodif ;
	private String typeCodif ;
	/**
	 * @return the idProspect
	 */
	public Long getIdProspect() {
		return idProspect;
	}
	/**
	 * @param idProspect the idProspect to set
	 */
	public void setIdProspect(Long idProspect) {
		this.idProspect = idProspect;
	}
	/**
	 * @return the idUser
	 */
	public Long getIdUser() {
		return idUser;
	}
	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	/**
	 * @return the dateCodif
	 */
	public Date getDateCodif() {
		return dateCodif;
	}
	/**
	 * @param dateCodif the dateCodif to set
	 */
	public void setDateCodif(Date dateCodif) {
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
	
	
	

}
