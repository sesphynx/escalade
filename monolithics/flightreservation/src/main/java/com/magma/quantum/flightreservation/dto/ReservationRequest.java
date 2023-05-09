package com.magma.quantum.flightreservation.dto;

public class ReservationRequest {

	private Long flightId ;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPhone;
	private String nameOfTheCard;
	private String CardNumber;
	private String expirationDate;
	private String securityCode;
	/**
	 * @return the flightId
	 */
	public Long getFlightId() {
		return flightId;
	}
	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	/**
	 * @return the passengerFirstName
	 */
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	/**
	 * @param passengerFirstName the passengerFirstName to set
	 */
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	/**
	 * @return the passengerLastName
	 */
	public String getPassengerLastName() {
		return passengerLastName;
	}
	/**
	 * @param passengerLastName the passengerLastName to set
	 */
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	/**
	 * @return the passengerEmail
	 */
	public String getPassengerEmail() {
		return passengerEmail;
	}
	/**
	 * @param passengerEmail the passengerEmail to set
	 */
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	/**
	 * @return the passengerPhone
	 */
	public String getPassengerPhone() {
		return passengerPhone;
	}
	/**
	 * @param passengerPhone the passengerPhone to set
	 */
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	/**
	 * @return the nameOfTheCard
	 */
	public String getNameOfTheCard() {
		return nameOfTheCard;
	}
	/**
	 * @param nameOfTheCard the nameOfTheCard to set
	 */
	public void setNameOfTheCard(String nameOfTheCard) {
		this.nameOfTheCard = nameOfTheCard;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return CardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	/**
	 * @return the securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}
	/**
	 * @param securityCode the securityCode to set
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	
}
