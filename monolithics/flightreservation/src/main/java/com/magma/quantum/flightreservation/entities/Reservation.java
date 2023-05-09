package com.magma.quantum.flightreservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{
	
	@Column(name="CHECKED_IN")
	private boolean  checkedIn;
	
	@Column (name="NUMBER_OF_BAGS")
	private int number_of_bags ;
	
	
	@OneToOne
	private Flight flight ;
	
	
	@OneToOne
	private Passenger passenger ;
	
	
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
	/**
	 * @return the number_of_bags
	 */
	public int getNumber_of_bags() {
		return number_of_bags;
	}
	/**
	 * @param number_of_bags the number_of_bags to set
	 */
	public void setNumber_of_bags(int number_of_bags) {
		this.number_of_bags = number_of_bags;
	}
	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}
	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	/**
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return passenger;
	}
	/**
	 * @param passenger the passenger to set
	 */
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	

}
