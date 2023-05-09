package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Promoteur;
import org.nioun.essentials.service.PromoteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/promoteur")
public class PromoteurController {


	@Autowired
	PromoteurService service;
	

	@RequestMapping("/ajouterPromoteur")
	public String ajouterPromoteur(ModelMap map) {
		Promoteur promoteur = new Promoteur();
		map.addAttribute(promoteur);
		return "creerPromoteur";
	}

	@RequestMapping("/sauvegarderPromoteur")
	public String sauvegarderPromoteur(@ModelAttribute("promoteur") Promoteur promoteur,
			ModelMap modelMap) {
		Promoteur promoteurSaved = service.savePromoteur(promoteur);
		String msg = "Promoteur sauvegarder avec l' id :" + promoteurSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerPromoteur";
	}

	@RequestMapping("/toutPromoteurs")
	public String toutPromoteurs(ModelMap modelMap) {

		List<Promoteur> promoteurs = service.getAllPromoteurs();
		modelMap.addAttribute("promoteurs", promoteurs);
		return "toutPromoteurs";
	}

	@RequestMapping("supprimerPromoteur")
	public String supprimerPromoteur(@RequestParam("id") Long id, ModelMap modelMap) {
		Promoteur promoteur = new Promoteur();
		promoteur.setId(id);
		service.deletePromoteur(promoteur);
		List<Promoteur> promoteurs = service.getAllPromoteurs();
		modelMap.addAttribute("promoteurs", promoteurs);
		return "toutPromoteurs";
	}

	@RequestMapping("/ciblerPromoteur")
	public String ciblerPromoteur(@RequestParam("id") Long  id, ModelMap modelMap) {
		Promoteur promoteur = new Promoteur();
		promoteur.setId(id);
		modelMap.addAttribute("promoteur", promoteur);
		return "ciblerPromoteur";
	}

	@RequestMapping("reglerPromoteur")
	public String reglerPromoteur(@ModelAttribute("promoteur") Promoteur promoteur, ModelMap modelMap) {
		service.updatePromoteur(promoteur);
		List<Promoteur> promoteurs = service.getAllPromoteurs();
		modelMap.addAttribute("promoteurs", promoteurs);
		return "toutPromoteurs";
	}


}
