package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Filiere;
import org.nioun.essentials.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/filiere")
public class FiliereController {


	@Autowired
	FiliereService service;
	

	@RequestMapping("/ajouterFiliere")
	public String ajouterFiliere(ModelMap map) {
		Filiere filiere = new Filiere();
		map.addAttribute(filiere);
		return "creerFiliere";
	}

	@RequestMapping("/sauvegarderFiliere")
	public String sauvegarderFiliere(@ModelAttribute("filiere") Filiere filiere,
			ModelMap modelMap) {
		Filiere filiereSaved = service.saveFiliere(filiere);
		String msg = "Filiere sauvegarder avec l' id :" + filiereSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerFiliere";
	}

	@RequestMapping("/toutFilieres")
	public String toutFilieres(ModelMap modelMap) {

		List<Filiere> filieres = service.getAllFilieres();
		modelMap.addAttribute("filieres", filieres);
		return "toutFilieres";
	}

	@RequestMapping("supprimerFiliere")
	public String supprimerFiliere(@RequestParam("id") Long id, ModelMap modelMap) {
		Filiere filiere = new Filiere();
		filiere.setId(id);
		service.deleteFiliere(filiere);
		List<Filiere> filieres = service.getAllFilieres();
		modelMap.addAttribute("filieres", filieres);
		return "toutFilieres";
	}

	@RequestMapping("/ciblerFiliere")
	public String ciblerFiliere(@RequestParam("id") Long  id, ModelMap modelMap) {
		Filiere filiere = new Filiere();
		filiere.setId(id);
		modelMap.addAttribute("filiere", filiere);
		return "ciblerFiliere";
	}

	@RequestMapping("reglerFiliere")
	public String reglerFiliere(@ModelAttribute("filiere") Filiere filiere, ModelMap modelMap) {
		service.updateFiliere(filiere);
		List<Filiere> filieres = service.getAllFilieres();
		modelMap.addAttribute("filieres", filieres);
		return "toutFilieres";
	}


}
