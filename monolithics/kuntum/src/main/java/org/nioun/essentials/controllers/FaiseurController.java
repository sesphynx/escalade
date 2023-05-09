package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Faiseur;
import org.nioun.essentials.service.FaiseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/faiseur")
public class FaiseurController {


	@Autowired
	FaiseurService service;
	

	@RequestMapping("/ajouterFaiseur")
	public String ajouterFaiseur(ModelMap map) {
		Faiseur faiseur = new Faiseur();
		map.addAttribute(faiseur);
		return "creerFaiseur";
	}

	@RequestMapping("/sauvegarderFaiseur")
	public String sauvegarderFaiseur(@ModelAttribute("faiseur") Faiseur faiseur,
			ModelMap modelMap) {
		Faiseur faiseurSaved = service.saveFaiseur(faiseur);
		String msg = "Faiseur sauvegarder avec l' id :" + faiseurSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerFaiseur";
	}

	@RequestMapping("/toutFaiseurs")
	public String toutFaiseurs(ModelMap modelMap) {

		List<Faiseur> faiseurs = service.getAllFaiseurs();
		modelMap.addAttribute("faiseurs", faiseurs);
		return "toutFaiseurs";
	}

	@RequestMapping("supprimerFaiseur")
	public String supprimerFaiseur(@RequestParam("id") Long id, ModelMap modelMap) {
		Faiseur faiseur = new Faiseur();
		faiseur.setId(id);
		service.deleteFaiseur(faiseur);
		List<Faiseur> faiseurs = service.getAllFaiseurs();
		modelMap.addAttribute("faiseurs", faiseurs);
		return "toutFaiseurs";
	}

	@RequestMapping("/ciblerFaiseur")
	public String ciblerFaiseur(@RequestParam("id") Long  id, ModelMap modelMap) {
		Faiseur faiseur = new Faiseur();
		faiseur.setId(id);
		modelMap.addAttribute("faiseur", faiseur);
		return "ciblerFaiseur";
	}

	@RequestMapping("reglerFaiseur")
	public String reglerFaiseur(@ModelAttribute("faiseur") Faiseur faiseur, ModelMap modelMap) {
		service.updateFaiseur(faiseur);
		List<Faiseur> faiseurs = service.getAllFaiseurs();
		modelMap.addAttribute("faiseurs", faiseurs);
		return "toutFaiseurs";
	}


}
