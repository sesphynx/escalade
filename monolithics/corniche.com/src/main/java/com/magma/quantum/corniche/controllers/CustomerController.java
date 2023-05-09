package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Customer;
import com.magma.quantum.corniche.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired 
	CustomerService customerService;

	
/*  Customer methods*/
	
	@RequestMapping("/creerCustomer")
	private String creerCustomer(){
		return "creerCustomer" ;
	}
	
	@RequestMapping("/enregistrerCustomer")
	private String enregistrerCustomer(@ModelAttribute("customer") Customer customer,ModelMap modelMap){
		Customer savedCustomer = customerService.saveCustomer(customer);
		String msg = "Customer Enregistré avec Id:"+savedCustomer.getId();
		return "creerCustomer" ;
	}
	@RequestMapping("/afficherAllCustomers")
	private String afficherAllCustomers(ModelMap modelMap){
		  List<Customer> customers = customerService.getAllCustomers();
		  modelMap.addAttribute("customers", customers);
		return "afficherAllCustomers" ;
	}
	@RequestMapping("/supprimerCustomer")
	private String supprimerCustomer(@RequestParam("id") Long id,ModelMap modelMap){
		Customer customer = new Customer();
		customer.setId(id);
		customerService.deleteCustomer(customer);
		List<Customer> customers = customerService.getAllCustomers();
		  modelMap.addAttribute("customers", customers);
		return "afficherAllCustomers" ;
	}
	@RequestMapping("/ciblerCustomer")
	private String ciblerCustomer(@RequestParam("id") Long id,ModelMap modelMap){
		Customer updatedCustomer = customerService.getCustomer(id);
		modelMap.addAttribute("customer", updatedCustomer);
		return "editerCustomer" ;
	}
	@RequestMapping("/editerCustomer")
	private String editerCustomer(@ModelAttribute("customer") Customer customer,ModelMap modelMap){
		customerService.saveCustomer(customer);
		List<Customer> customers = customerService.getAllCustomers();
		  modelMap.addAttribute("customers", customers);
		return "afficherAllCustomers" ;
	}
}
