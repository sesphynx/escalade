package org.nioun.essentials.paiement.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paiement {

	@Id
	private Long paiementId;
	
	private String name;
	
	private Long commandeId ;

	private String description;

	private BigDecimal quantite ;

	private BigDecimal price ;

	private BigDecimal prixTotal;

	private String env ;

	private Long clientId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phone;
	
	private String addresse;

	
	public Paiement(){
		
	}


	public Paiement(Long paiementId, String name, Long commandeId, String nameCommande, String description,
			BigDecimal quantite, BigDecimal price, BigDecimal prixTotal, String env, Long clientId, String firstName,
			String lastName, String email, String phone, String addresse) {
		super();
		this.paiementId = paiementId;
		this.name = name;
		this.commandeId = commandeId;
		this.description = description;
		this.quantite = quantite;
		this.price = price;
		this.prixTotal = prixTotal;
		this.env = env;
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.addresse = addresse;
	}


	public Long getPaiementId() {
		return paiementId;
	}


	public void setPaiementId(Long paiementId) {
		this.paiementId = paiementId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getCommandeId() {
		return commandeId;
	}


	public void setCommandeId(Long commandeId) {
		this.commandeId = commandeId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getQuantite() {
		return quantite;
	}


	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public BigDecimal getPrixTotal() {
		return prixTotal;
	}


	public void setPrixTotal(BigDecimal prixTotal) {
		this.prixTotal = prixTotal;
	}


	public String getEnv() {
		return env;
	}


	public void setEnv(String env) {
		this.env = env;
	}


	public Long getClientId() {
		return clientId;
	}


	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddresse() {
		return addresse;
	}


	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	
	
	
	
}
