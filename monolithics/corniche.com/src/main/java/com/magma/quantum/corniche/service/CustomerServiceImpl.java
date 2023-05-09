package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Customer;
import com.magma.quantum.corniche.repos.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);

	}

	
	public Customer getCustomer(Long id) {
	
		return customerRepository.findOne(id);
	}

	
	public List<Customer> getAllCustomers() {
	
		return customerRepository.findAll();
	}

}
