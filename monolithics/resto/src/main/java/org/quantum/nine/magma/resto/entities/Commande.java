package org.quantum.nine.magma.resto.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande extends AbstractEntity {
	
	private String orderNumber;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="commande")
	private Set<CommandeComposante> items;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="client_id")
	private Client client;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="addr_livraison_id")
	private Addresse addresseLivraison;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="addr_facturation_id")
	private Addresse addresseFacturation;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "payment_id")
	private Payment payment;
	
	@Enumerated(EnumType.STRING)
	private CommandeEtat etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Set<CommandeComposante> getItems() {
		return items;
	}

	public void setItems(Set<CommandeComposante> items) {
		this.items = items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Addresse getAddresseLivraison() {
		return addresseLivraison;
	}

	public void setAddresseLivraison(Addresse addresseLivraison) {
		this.addresseLivraison = addresseLivraison;
	}

	public Addresse getAddresseFacturation() {
		return addresseFacturation;
	}

	public void setAddresseFacturation(Addresse addresseFacturation) {
		this.addresseFacturation = addresseFacturation;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public CommandeEtat getEtat() {
		return etat;
	}

	public void setEtat(CommandeEtat etat) {
		this.etat = etat;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Commande [orderNumber=" + orderNumber + ", items=" + items + ", client=" + client
				+ ", addresseLivraison=" + addresseLivraison + ", addresseFacturation=" + addresseFacturation
				+ ", payment=" + payment + ", etat=" + etat + ", createdOn=" + createdOn + "]";
	}
	
	

}
