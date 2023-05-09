package org.nioun.essentials.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Producteur  extends AbstractEntity{
	

	private String name;
	
	private String description;
	
	private boolean disabled;
	
	@ManyToMany
	public List<Filiere> filieres;
	
	@OneToMany(mappedBy="producteur")
	private List<Produit> produits;
	

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

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	public List<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (disabled ? 1231 : 1237);
		result = prime * result + ((filieres == null) ? 0 : filieres.hashCode());
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
		Producteur other = (Producteur) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (disabled != other.disabled)
			return false;
		if (filieres == null) {
			if (other.filieres != null)
				return false;
		} else if (!filieres.equals(other.filieres))
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
		return "Producteur [name=" + name + ", description=" + description + ", disabled=" + disabled + ", filieres="
				+ filieres + ", produits=" + produits + "]";
	}
	
	

}
