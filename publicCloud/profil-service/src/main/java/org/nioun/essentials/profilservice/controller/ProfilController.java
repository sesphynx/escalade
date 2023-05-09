package org.nioun.essentials.profilservice.controller;

import java.util.List;

import org.nioun.essentials.core.niounmodel.Customer;
import org.nioun.essentials.profilservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ProfilController {
	
	@Autowired
	CustomerService customerService ;
	
	@RequestMapping(value = "/profile" , method = RequestMethod.POST)
	Customer save ( @RequestBody Customer customer){
		return customerService.save(customer) ;
	}

	@RequestMapping(value="/profile" , method = RequestMethod.GET)
	Customer fetch(@RequestParam Long profileId){
		return customerService.fetchById(profileId);
	}
	
	@RequestMapping(value="/profiles" , method = RequestMethod.GET)
	List<Customer> fetch(){
		return customerService.fetchAllProfiles();
	}
	
}
