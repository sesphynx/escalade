package org.nioun.essentials.controllers;

import java.util.ArrayList;
import java.util.List;

import org.nioun.essentials.entities.Producteur;
import org.nioun.essentials.repos.ProducteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/producteur")
public class ProducteurController {
	
	@Autowired
	ProducteurRepository producteurRep ;
	
	@GetMapping(value="/creerProducteur")
	public String creerProducteur(ModelMap map) {
		Producteur producteur = new Producteur();
		map.addAttribute(producteur);
		return "creerProducteur";
	}
	
	@GetMapping(value="/toutProducteurs")
	public String toutProducteurs(ModelMap map ) {
		List<Producteur> producteurs = producteurRep.findAll();
		map.addAttribute("producteurs", producteurs);
		return "producteurs";
	}
	
	@PostMapping(path="/sauvegarderProducteur")
	public String sauvegarderProducteur(@ModelAttribute("producteur") Producteur producteur) {
		producteurRep.save(producteur);
	return "creerproducteur";	
	}
	
	@DeleteMapping(value="/supprimerProducteur")
	public String supprimerProducteur( Producteur producteur ) {
		producteurRep.delete(producteur);
		return "producteurs";
	}
	
	@PutMapping(path="/reglerProducteur")
	public String reglerProducteur(@ModelAttribute("producteur") Producteur producteur) {
		producteurRep.save(producteur);
	return "producteurs";	
	}
	
	@RequestMapping("/ciblerProducteur")
	public String ciblerProducteur(@RequestParam ("id") Long id , ModelMap model) {
		Producteur producteur = producteurRep.getOne(id);
		model.addAttribute("producteur", producteur);
		return "ciblerProducteur";
		
	}
	
	
	@ModelAttribute
	List<Producteur>  inProducteurs(ModelMap model){
		
		List<Producteur>	initProducteurs = new ArrayList<>() ;
		
		Producteur producteur0= new Producteur();
		producteur0.setDescription("Stylisme");
		producteur0.setDisabled(false);
		producteur0.setName("aichart");
		
		Producteur producteur1= new Producteur();
		producteur1.setDescription("Ebenisterie");
		producteur1.setDisabled(false);
		producteur1.setName("Fama");
		
		producteurRep.save(producteur0);
		producteurRep.save(producteur1);
		
		initProducteurs.add(producteur0);
		initProducteurs.add(producteur1);
		
		model.addAllAttributes(initProducteurs);
		return initProducteurs ;
	}


}
