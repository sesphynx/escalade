package com.magma.quantum.machintech.entities;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Retard extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	private LocalDateTime  entree ;
	private LocalDateTime arrivee ;
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getEntree() {
		return entree;
	}
	public void setEntree(LocalDateTime entree) {
		this.entree = entree;
	}
	public LocalDateTime getArrivee() {
		return arrivee;
	}
	public void setArrivee(LocalDateTime arrivee) {
		this.arrivee = arrivee;
	}
	@Override
	public String toString() {
		return "Retard [user=" + user + ", entree=" + entree + ", arrivee=" + arrivee + "]";
	}
	
	
	
	
}
