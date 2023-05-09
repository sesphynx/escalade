package org.quantum.nine.magma.resto.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Payment extends AbstractEntity {
	
	private String ccNumber;
	
	private String cvv;
	
	private BigDecimal amount;

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [ccNumber=" + ccNumber + ", cvv=" + cvv + ", amount=" + amount + "]";
	}
	
	

}
