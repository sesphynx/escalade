package org.nioun.essentials.profilservice.service;

import java.util.List;
import java.util.Optional;

import org.nioun.essentials.core.niounmodel.Customer;
import org.nioun.essentials.profilservice.repos.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	ProfilRepository profilRepository ;
	
	
	public Customer save(Customer customer) {
		
		return profilRepository.save(customer);
	}

	public Customer fetchById(Long profileId) {
	
		Optional<Customer>	customer = profilRepository.findById(profileId);
	
	if (customer.isPresent()){
		return customer.get();
	}
	else {
		return null ;
	}	
	
	
	}

	public List<Customer> fetchAllProfiles() {
		
		return profilRepository.findAll();
	}

}
