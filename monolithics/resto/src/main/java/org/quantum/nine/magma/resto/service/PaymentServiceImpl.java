package org.quantum.nine.magma.resto.service;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.quantum.nine.magma.resto.entities.Payment;
import org.quantum.nine.magma.resto.repos.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository ;
	
	

	public PaymentRepository getPaymentRepository() {
		return paymentRepository;
	}

	public void setPaymentRepository(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@Override
	public Payment savePayment(Payment payment) {

		return paymentRepository.save(payment);
	}

	@Override
	public Payment updatePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public void deletePayment(Payment payment) {
    paymentRepository.delete(payment);

	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentRepository.getOne(id);
	}

	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}


}
