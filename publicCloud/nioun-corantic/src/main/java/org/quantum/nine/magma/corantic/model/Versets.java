package org.quantum.nine.magma.corantic.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Versets extends AbstractEntity {
	
	private int num ;
	
	private String contenu ;
	
	@ManyToOne
	@JoinColumn(name="surat_id")
	private Surat surat ;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Surat getSurat() {
		return surat;
	}

	public void setSurat(Surat surat) {
		this.surat = surat;
	} 

	
	
}
