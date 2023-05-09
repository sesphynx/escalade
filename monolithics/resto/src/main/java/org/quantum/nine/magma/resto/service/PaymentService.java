package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Payment;

public interface PaymentService {


	Payment savePayment(Payment payment);

	Payment updatePayment(Payment payment);

	void deletePayment(Payment payment);

	Payment getPaymentById(Long id);

	List<Payment> getAllPayments();
}
