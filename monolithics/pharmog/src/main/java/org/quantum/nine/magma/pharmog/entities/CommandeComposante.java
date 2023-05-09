package org.quantum.nine.magma.pharmog.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommandeComposante extends AbstractEntity {
	@ManyToOne
	@JoinColumn(name="produit_id")
	private Produit   produit ;
	
	private BigDecimal price;
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="commande_id")
	private Commande commande;

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "CommandeComposante [produit=" + produit + ", price=" + price + ", quantity=" + quantity + ", commande="
				+ commande + "]";
	}
	
	
	

}
