package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	Customer getCustomer(Long id);
	List<Customer> getAllCustomers();
}
