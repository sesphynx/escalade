package com.magma.quantum.corniche.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Evenement extends AbstractEntity {

	Date dateEvnmt ;
	String lieu ;
	String descriptif ;
	
	public Date getDateEvnmt() {
		return dateEvnmt;
	}
	public void setDateEvnmt(Date dateEvnmt) {
		this.dateEvnmt = dateEvnmt;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
												}
