package com.magma.quantum.hotelya.integration.dto;

public class ReservationUpdateRequest {
private Long id ; 
private boolean checkedIn;
private int numberOfBags;
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
 * @return the numberOfBags
 */
public int getNumberOfBags() {
	return numberOfBags;
}
/**
 * @param numberOfBags the numberOfBags to set
 */
public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}


}
