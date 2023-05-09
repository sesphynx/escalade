package org.nioun.essentials.surat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Surat {

	@Id
	@GeneratedValue
	public Long suratId;
	public Integer ordre;
	public String tour ;
	
	public Long getSuratId() {
		return suratId;
	}
	public void setSuratId(Long suratId) {
		this.suratId = suratId;
	}
	public Integer getOrdre() {
		return ordre;
	}
	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}
	public String getTour() {
		return tour;
	}
	public void setTour(String tour) {
		this.tour = tour;
	}
	
	
	
}
