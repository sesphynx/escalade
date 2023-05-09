package com.magma.quantum.corniche.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Logis extends AbstractEntity {

	public String numero ;
	public String type ;
	public int surface ;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	} 
	
	
}
