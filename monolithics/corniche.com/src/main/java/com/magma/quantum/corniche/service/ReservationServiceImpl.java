package com.magma.quantum.corniche.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.dto.ReservationRequest;
import com.magma.quantum.corniche.entities.Customer;
import com.magma.quantum.corniche.entities.Logis;
import com.magma.quantum.corniche.entities.Reservationchambre;
import com.magma.quantum.corniche.repos.CustomerRepository;
import com.magma.quantum.corniche.repos.LogisRepository;
import com.magma.quantum.corniche.repos.ReservationchambreRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	LogisRepository logisRepository ;
	
	@Autowired
	CustomerRepository customerRepository ;
	
	@Autowired
	ReservationchambreRepository reservationchambreRepository ;
	
	public Reservationchambre bookFlight (ReservationRequest request) {
		
		//make payment
		
		Long logisId = request.getLogisId();
		Logis  logis = logisRepository.findOne(logisId);
		Customer customer = new Customer();
		customer.setFirst_name(request.getCustomerFirstName());
		customer.setLast_name(request.getCustomerLastName());
		customer.setEmail(request.getCustomerEmail());
		customer.setPhone(request.getCustomerPhone());
		
		Customer savedCustomer =  customerRepository.saveAndFlush(customer);
		 
		 Reservationchambre reservationchambre = new Reservationchambre();
		 reservationchambre.setLogis(logis);
		 reservationchambre.setCustomer(savedCustomer);
		 reservationchambre.setCheckedIn(false);
		 Reservationchambre savedReservation = reservationchambreRepository.saveAndFlush(reservationchambre);
		
		
		return savedReservation;
	}

}
