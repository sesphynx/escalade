package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Bailleur;
import org.nioun.essentials.service.BailleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bailleur")
public class BailleurController {


	@Autowired
	BailleurService service;
	

	@RequestMapping("/ajouterBailleur")
	public String ajouterBailleur(ModelMap map) {
		Bailleur bailleur = new Bailleur();
		map.addAttribute(bailleur);
		return "creerBailleur";
	}

	@RequestMapping("/sauvegarderBailleur")
	public String sauvegarderBailleur(@ModelAttribute("bailleur") Bailleur bailleur,
			ModelMap modelMap) {
		Bailleur bailleurSaved = service.saveBailleur(bailleur);
		String msg = "Bailleur sauvegarder avec l' id :" + bailleurSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerBailleur";
	}

	@RequestMapping("/toutBailleurs")
	public String toutBailleurs(ModelMap modelMap) {

		List<Bailleur> bailleurs = service.getAllBailleurs();
		modelMap.addAttribute("bailleurs", bailleurs);
		return "toutBailleurs";
	}

	@RequestMapping("supprimerBailleur")
	public String supprimerBailleur(@RequestParam("id") Long id, ModelMap modelMap) {
		Bailleur bailleur = new Bailleur();
		bailleur.setId(id);
		service.deleteBailleur(bailleur);
		List<Bailleur> bailleurs = service.getAllBailleurs();
		modelMap.addAttribute("bailleurs", bailleurs);
		return "toutBailleurs";
	}

	@RequestMapping("/ciblerBailleur")
	public String ciblerBailleur(@RequestParam("id") Long  id, ModelMap modelMap) {
		Bailleur bailleur = new Bailleur();
		bailleur.setId(id);
		modelMap.addAttribute("bailleur", bailleur);
		return "ciblerBailleur";
	}

	@RequestMapping("reglerBailleur")
	public String reglerBailleur(@ModelAttribute("bailleur") Bailleur bailleur, ModelMap modelMap) {
		service.updateBailleur(bailleur);
		List<Bailleur> bailleurs = service.getAllBailleurs();
		modelMap.addAttribute("bailleurs", bailleurs);
		return "toutBailleurs";
	}


}
