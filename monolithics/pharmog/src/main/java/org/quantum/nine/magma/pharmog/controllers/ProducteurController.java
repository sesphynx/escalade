package org.quantum.nine.magma.pharmog.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Producteur;
import org.quantum.nine.magma.pharmog.service.ProducteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ProducteurController {
	
	@Autowired
	ProducteurService service ;
	
	@RequestMapping("/ajouterProducteur")
	public String ajouterProducteur(ModelMap map) {
		
		Producteur producteur = new Producteur();
		map.addAttribute(producteur);
		
		List<String> listDisabled = new LinkedList<>(Arrays.asList(new String[] {"Disponible","Indisponible"}));
		map.addAttribute("listDisabled", listDisabled);
		
		
		return "creerProducteur";
	}

	@RequestMapping("/sauvegarderProducteur")
	public String sauvegarderProducteur(@ModelAttribute("producteur") Producteur producteur,
							ModelMap modelMap) {
		Producteur producteurSaved = service.saveProducteur(producteur);
		String msg = "Producteur saved with id :" + producteurSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerProducteur";
	}

	@RequestMapping("/toutProducteurs")
	public String toutProducteurs(ModelMap modelMap) {

		List<Producteur> producteurs = service.getAllProducteurs();
		modelMap.addAttribute("producteurs", producteurs);
		return "toutProducteurs";
	}

	@RequestMapping("supprimerProducteur")
	public String supprimerProducteur(@RequestParam("id") Long id, ModelMap modelMap) {
		Producteur producteur = new Producteur();
		producteur.setId(id);
		service.deleteProducteur(producteur);
		List<Producteur> producteurs = service.getAllProducteurs();
		modelMap.addAttribute("producteurs", producteurs);
		return "toutProducteurs";
	}

	@RequestMapping("/ciblerProducteur")
	public String ciblerProducteur(@RequestParam("id") Long  id, ModelMap modelMap) {
		Producteur producteur = new Producteur();
		producteur.setId(id);
		modelMap.addAttribute("producteur", producteur);
		return "ciblerProducteur";
	}

	@RequestMapping("/reglerProducteur")
	public String reglerProducteur(@ModelAttribute("producteur") Producteur producteur, ModelMap modelMap) {
		service.updateProducteur(producteur);
		List<Producteur> producteurs = service.getAllProducteurs();
		modelMap.addAttribute("producteurs", producteurs);
		return "toutProducteurs";
	}

	
	
}
