package org.nioun.essentials.batcher.config;

import org.nioun.essentials.batcher.entity.Customer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
	if(customer.getCountry().equals("Russia")) {
		return customer;
	}
		
		return null ;
	}

}
