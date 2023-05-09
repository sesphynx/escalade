package com.magma.quantum.corniche.entities;

import javax.persistence.Entity;

@Entity
public class Collation extends Plan {
	
	public String nature ; 
	public String prix ; 
	public String ingredients ;
	
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	} 
	
	

}
