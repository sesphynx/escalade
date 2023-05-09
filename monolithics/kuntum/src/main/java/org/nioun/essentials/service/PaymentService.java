package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Payment;

public interface PaymentService {


	Payment savePayment(Payment payment);

	Payment updatePayment(Payment payment);

	void deletePayment(Payment payment);

	Payment getPaymentById(Long id);

	List<Payment> getAllPayments();
}
