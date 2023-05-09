package com.magma.quantum.flightreservation.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Flight  extends AbstractEntity{
	
	@Column(name="FLIGHT_NUMBER")
	private String flight_number;
	
	@Column(name="OPERATING_AIRLINES")
	private String operating_airlines;
	
	@Column(name="DEPARTURE_CITY")
	private String departure_city;
	
	@Column(name="ARRIVAL_CITY")
	private String arrival_city;
	
	@Column(name="DATE_OF_DEPARTURE")
	private Date date_of_departure;
	
	@Column(name="ESTIMATED_DEPARTURE_TIME")
	private Timestamp estimated_departure_time;
	
	/**
	 * @return the flight_number
	 */
	public String getFlight_number() {
		return flight_number;
	}
	/**
	 * @param flight_number the flight_number to set
	 */
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	/**
	 * @return the operating_airlines
	 */
	public String getOperating_airlines() {
		return operating_airlines;
	}
	/**
	 * @param operating_airlines the operating_airlines to set
	 */
	public void setOperating_airlines(String operating_airlines) {
		this.operating_airlines = operating_airlines;
	}
	
	/**
	 * @return the departure_city
	 */
	public String getDeparture_city() {
		return departure_city;
	}
	/**
	 * @param departure_city the departure_city to set
	 */
	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}
	/**
	 * @return the arrival_city
	 */
	public String getArrival_city() {
		return arrival_city;
	}
	/**
	 * @param arrival_city the arrival_city to set
	 */
	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}
	/**
	 * @return the date_of_departure
	 */
	public Date getDate_of_departure() {
		return date_of_departure;
	}
	/**
	 * @param date_of_departure the date_of_departure to set
	 */
	public void setDate_of_departure(Date date_of_departure) {
		this.date_of_departure = date_of_departure;
	}
	/**
	 * @return the estimated_departure_time
	 */
	public Timestamp getEstimated_departure_time() {
		return estimated_departure_time;
	}
	/**
	 * @param estimated_departure_time the estimated_departure_time to set
	 */
	public void setEstimated_departure_time(Timestamp estimated_departure_time) {
		this.estimated_departure_time = estimated_departure_time;
	}
	
	
	
	

}
