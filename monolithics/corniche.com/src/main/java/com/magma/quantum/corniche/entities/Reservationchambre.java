package com.magma.quantum.corniche.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservationchambre extends AbstractEntity{

	private Date startReservationDate ;
	
	private Date endReservationDate ;
	
	private boolean  checkedIn;
	
	@OneToOne
	private Logis logis ;
	
	@OneToOne
	private Customer customer ;
	
	private Date createdDate ;
	
	
	/**
	 * @return the checkedIn
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}
	/**
	 * @param checkedIn the checkedIn to set
	 */
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Date getStartReservationDate() {
		return startReservationDate;
	}
	public void setStartReservationDate(Date startReservationDate) {
		this.startReservationDate = startReservationDate;
	}
	public Date getEndReservationDate() {
		return endReservationDate;
	}
	public void setEndReservationDate(Date endReservationDate) {
		this.endReservationDate = endReservationDate;
	}
	public Logis getLogis() {
		return logis;
	}
	public void setLogis(Logis logis) {
		this.logis = logis;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

}
