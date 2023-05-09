package org.nioun.essentials.entities;

import java.util.Date;
import java.util.List;
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
	private List<Article> items;
	
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

	public List<Article> getItems() {
		return items;
	}
	public void setItems(List<Article> items) {
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((addresseFacturation == null) ? 0 : addresseFacturation.hashCode());
		result = prime * result + ((addresseLivraison == null) ? 0 : addresseLivraison.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
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
		Commande other = (Commande) obj;
		if (addresseFacturation == null) {
			if (other.addresseFacturation != null)
				return false;
		} else if (!addresseFacturation.equals(other.addresseFacturation))
			return false;
		if (addresseLivraison == null) {
			if (other.addresseLivraison != null)
				return false;
		} else if (!addresseLivraison.equals(other.addresseLivraison))
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (etat != other.etat)
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commande [orderNumber=" + orderNumber + ", items=" + items + ", client=" + client
				+ ", addresseLivraison=" + addresseLivraison + ", addresseFacturation=" + addresseFacturation
				+ ", payment=" + payment + ", etat=" + etat + ", createdOn=" + createdOn + "]";
	}

	
	
	

}
