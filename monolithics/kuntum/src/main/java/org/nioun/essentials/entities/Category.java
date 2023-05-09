package org.nioun.essentials.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Category extends AbstractEntity {
	
	private String name;
	
	private String description;
	
	private Integer displayOrder;
	
	private boolean disabled;
	
	@OneToMany(mappedBy="category")
	private Set<Produit> produits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProducts(Set<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", displayOrder=" + displayOrder
				+ ", disabled=" + disabled + ", produits=" + produits + "]";
	}
	
	

}
