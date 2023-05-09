package com.magma.quantum.politicone.dto;

public class ReservationRequest {

	private Long logisId ;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private String customerPhone;
	private String nameOfTheCard;
	private String CardNumber;
	private String expirationDate;
	private String securityCode;
	
	
	
	
	public Long getLogisId() {
		return logisId;
	}
	public void setLogisId(Long logisId) {
		this.logisId = logisId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
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
