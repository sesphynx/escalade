package org.nioun.essentials.producteurservice.controller;

import java.util.List;

import org.nioun.essentials.producteurservice.service.ProducteurService;
import org.nioun.essentials.niouncommerce.Producteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ProducteurController {
	
	@Autowired
	ProducteurService producteurService ;
	
	@RequestMapping(value = "/producteur" , method = RequestMethod.POST)
	Producteur save ( @RequestBody Producteur producteur){
		return producteurService.saveProducteur(producteur) ;
	}

	@RequestMapping(value="/producteur" , method = RequestMethod.GET)
	Producteur fetch(@RequestParam Long producteurId){
		return producteurService.getProducteurById(producteurId);
	}
	
	@RequestMapping(value="/producteurs" , method = RequestMethod.GET)
	List<Producteur> fetch(){
		return producteurService.getAllProducteurs();
	}
	
}
