package com.magma.quantum.politicone.dto;

public class ReservationUpdateRequest {
private Long id ; 
private boolean checkedIn;
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

}
