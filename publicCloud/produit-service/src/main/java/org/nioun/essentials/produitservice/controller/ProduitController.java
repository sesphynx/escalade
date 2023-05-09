package org.nioun.essentials.produitservice.controller;

import java.util.List;

import org.nioun.essentials.niouncommerce.Produit;
import org.nioun.essentials.produitservice.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ProduitController {
	
	@Autowired
	ProduitService produitService ;
	
	@RequestMapping(value = "/produit" , method = RequestMethod.POST)
	Produit save ( @RequestBody Produit produit){
		return produitService.saveProduit(produit) ;
	}

	@RequestMapping(value="/produit" , method = RequestMethod.GET)
	Produit fetch(@RequestParam Long produitId){
		return produitService.getProduitById(produitId);
	}
	
	@RequestMapping(value="/produits" , method = RequestMethod.GET)
	List<Produit> fetch(){
		return produitService.getAllProduits();
	}
	
}
