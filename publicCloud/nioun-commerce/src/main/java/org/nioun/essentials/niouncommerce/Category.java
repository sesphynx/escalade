package org.nioun.essentials.niouncommerce;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="category")
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (disabled ? 1231 : 1237);
		result = prime * result + ((displayOrder == null) ? 0 : displayOrder.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((produits == null) ? 0 : produits.hashCode());
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
		Category other = (Category) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (disabled != other.disabled)
			return false;
		if (displayOrder == null) {
			if (other.displayOrder != null)
				return false;
		} else if (!displayOrder.equals(other.displayOrder))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (produits == null) {
			if (other.produits != null)
				return false;
		} else if (!produits.equals(other.produits))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", displayOrder=" + displayOrder
				+ ", disabled=" + disabled + ", produits=" + produits + "]";
	}
	
	

}
