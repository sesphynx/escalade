package org.nioun.essentials.niouncommerce;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "produit")
public class Produit extends AbstractEntity {
	
	
	private String sku;
	private String name;
	private String description;
	private BigDecimal price = new BigDecimal("0.0");
	private String imageUrl;
	
	@Lob
	private byte[]  data ;
	
	private String base64;
	
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
	
	

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
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
	public String toString() {
		return "Produit [sku=" + sku + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", imageUrl=" + imageUrl + ", data=" + Arrays.toString(data) + ", base64=" + base64 + ", disabled="
				+ disabled + ", createdOn=" + createdOn + ", category=" + category + ", producteur=" + producteur + "]";
	}

	
}
