package org.nioun.essentials.profilservice.service;

import java.util.List;

import org.nioun.essentials.core.niounmodel.Customer;

public interface CustomerService {

	Customer save(Customer customer);
	Customer   fetchById(Long profileId);
	List<Customer> fetchAllProfiles();
}
