package org.nioun.essentials.addresseservice.controller;

import java.util.List;

import org.nioun.essentials.addresseservice.service.AddresseService;
import org.nioun.essentials.niouncore.Addresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class AddresseController {
	
	@Autowired
	AddresseService addresseService ;
	
	@RequestMapping(value = "/addresse" , method = RequestMethod.POST)
	Addresse save ( @RequestBody Addresse addresse){
		return addresseService.saveAddresse(addresse) ;
	}

	@RequestMapping(value="/addresse" , method = RequestMethod.GET)
	Addresse fetch(@RequestParam Long addresseId){
		return addresseService.getAddresseById(addresseId);
	}
	
	@RequestMapping(value="/addresses" , method = RequestMethod.GET)
	List<Addresse> fetch(){
		return addresseService.getAllAddresses();
	}
	
}
