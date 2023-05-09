package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Projet;
import org.nioun.essentials.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/projet")
public class ProjetController {


	@Autowired
	ProjetService service;
	

	@RequestMapping("/ajouterProjet")
	public String ajouterProjet(ModelMap map) {
		Projet projet = new Projet();
		map.addAttribute(projet);
		return "creerProjet";
	}

	@RequestMapping("/sauvegarderProjet")
	public String sauvegarderProjet(@ModelAttribute("projet") Projet projet,
			ModelMap modelMap) {
		Projet projetSaved = service.saveProjet(projet);
		String msg = "Projet sauvegarder avec l' id :" + projetSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerProjet";
	}

	@RequestMapping("/toutProjets")
	public String toutProjets(ModelMap modelMap) {

		List<Projet> projets = service.getAllProjets();
		modelMap.addAttribute("projets", projets);
		return "toutProjets";
	}

	@RequestMapping("supprimerProjet")
	public String supprimerProjet(@RequestParam("id") Long id, ModelMap modelMap) {
		Projet projet = new Projet();
		projet.setId(id);
		service.deleteProjet(projet);
		List<Projet> projets = service.getAllProjets();
		modelMap.addAttribute("projets", projets);
		return "toutProjets";
	}

	@RequestMapping("/ciblerProjet")
	public String ciblerProjet(@RequestParam("id") Long  id, ModelMap modelMap) {
		Projet projet = new Projet();
		projet.setId(id);
		modelMap.addAttribute("projet", projet);
		return "ciblerProjet";
	}

	@RequestMapping("reglerProjet")
	public String reglerProjet(@ModelAttribute("projet") Projet projet, ModelMap modelMap) {
		service.updateProjet(projet);
		List<Projet> projets = service.getAllProjets();
		modelMap.addAttribute("projets", projets);
		return "toutProjets";
	}


}
