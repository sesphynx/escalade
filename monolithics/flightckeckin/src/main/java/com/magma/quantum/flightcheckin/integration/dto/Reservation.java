package com.magma.quantum.flightcheckin.integration.dto;



public class Reservation {
	private Long id ;
	
	private boolean  checkedIn;
	
	private int number_of_bags ;
	
	private Flight flight ;
	
	
	private Passenger passenger ;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
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
