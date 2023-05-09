package org.nioun.essentials.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.apache.tomcat.util.codec.binary.Base64;

@Entity
public class Produit extends AbstractEntity {
	
	
	private String sku;
	private String name;
	private String description;
	private BigDecimal price = new BigDecimal("0.0");
	private String imageUrl;
	
	
	private boolean disabled;
	
	private Date createdOn ;
	
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="producteur_id")
	private Producteur producteur;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	

	public Producteur getProducteur() {
		return producteur;
	}

	public void setProducteur(Producteur producteur) {
		this.producteur = producteur;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (disabled ? 1231 : 1237);
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((producteur == null) ? 0 : producteur.hashCode());
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
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
		Produit other = (Produit) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (disabled != other.disabled)
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (producteur == null) {
			if (other.producteur != null)
				return false;
		} else if (!producteur.equals(other.producteur))
			return false;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produit [sku=" + sku + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", imageUrl=" + imageUrl + ", disabled=" + disabled + ", createdOn=" + createdOn + ", category="
				+ category + ", producteur=" + producteur + "]";
	}

	
}
