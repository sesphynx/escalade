package org.quantum.nine.magma.pharmog.controllers;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Category;
import org.quantum.nine.magma.pharmog.entities.Producteur;
import org.quantum.nine.magma.pharmog.entities.Produit;
import org.quantum.nine.magma.pharmog.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes
public class ProduitController {
	
	@Autowired
	CatalogueService service ;
	
	@RequestMapping("/ajouterProduit")
	public String ajouterProduit(ModelMap map) {
		
		List<Category> categorys=service.getAllCategorys() ;
		map.addAttribute("categorys", categorys);
		
		List<Producteur> producteurs=service.getAllProducteurs()  ;
		map.addAttribute("producteurs", producteurs);
		
		
		Produit produit = new Produit();
		map.addAttribute(produit);
		return "creerProduit";
	}
	
	
	
	@PostMapping("/vueProduit")
	public String vueProduit(@RequestParam Category category, @RequestParam Producteur producteur , 
							 @RequestParam String sku , @RequestParam String name ,
							 @RequestParam String description, @RequestParam BigDecimal price ,
							 @RequestParam File image , @RequestParam String disabled,
							 @RequestParam Date createdOn  , ModelMap map) {
	    
		map.addAttribute("category", category);
		map.addAttribute("producteur" , producteur);
		map.addAttribute("sku",sku );
		map.addAttribute("name", name);
		map.addAttribute("description", description);
		map.addAttribute("price", price);
		map.addAttribute("image", image);
		map.addAttribute("disabled", disabled);
		map.addAttribute("createdOn", createdOn);

	    return "vueProduit" ;
	}

	@RequestMapping("/sauvegarderProduit")
	public String sauvegarderProduit(@ModelAttribute("produit") Produit produit,
							ModelMap produitFormMap) {
		Produit produitSaved = service.saveProduit(produit);
		String msg = "Produit saved with id :" + produitSaved.getId() ;
		produitFormMap.addAttribute("msg", msg);
		return "redirect:/creerProduit";
	}

	@RequestMapping("/toutProduits")
	public String toutProduits(ModelMap produitFormMap) {

		List<Produit> produits = service.getAllProduits();
		produitFormMap.addAttribute("produits", produits);
		return "toutProduits";
	}

	@RequestMapping("supprimerProduit")
	public String supprimerProduit(@RequestParam("id") Long id, ModelMap produitFormMap) {
		Produit produit = new Produit();
		produit.setId(id);
		service.deleteProduit(produit);
		List<Produit> produits = service.getAllProduits();
		produitFormMap.addAttribute("produits", produits);
		return "toutProduits";
	}

	@RequestMapping("/ciblerProduit")
	public String ciblerProduit(@RequestParam("id") Long  id, ModelMap produitFormMap) {
		Produit produit = new Produit();
		produit.setId(id);
		produitFormMap.addAttribute("produit", produit);
		return "ciblerProduit";
	}

	@RequestMapping("reglerProduit")
	public String reglerProduit(@ModelAttribute("produit") Produit produit, ModelMap produitFormMap) {
		service.updateProduit(produit);
		List<Produit> produits = service.getAllProduits();
		produitFormMap.addAttribute("produits", produits);
		return "toutProduits";
	}

	@ModelAttribute("produit")
	public Produit getProduit() {
		return new Produit();
	}
	

	
	
}
