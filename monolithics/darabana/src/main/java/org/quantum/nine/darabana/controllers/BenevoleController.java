package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Asc;
import org.quantum.nine.darabana.entities.Benevole;
import org.quantum.nine.darabana.entities.Commune;
import org.quantum.nine.darabana.entities.Localisation;
import org.quantum.nine.darabana.service.AscService;
import org.quantum.nine.darabana.service.BenevoleService;
import org.quantum.nine.darabana.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BenevoleController {

	

	@Autowired
	BenevoleService service;
	
	@Autowired
	CommuneService communeService;
	
	@Autowired
	AscService ascService;
			

	@RequestMapping("/showCreateBenevole")
	public String showCreateBenevole(ModelMap map) {
		Benevole benevole = new Benevole();
		map.addAttribute(benevole);
		List<Commune> communes = communeService.getAllCommunes();
		map.addAttribute("communes",communes);
		
		List<Asc> ascs = ascService.getAllAscs();
		map.addAttribute("ascs",ascs);
		
		return "createBenevole";
	}

	@RequestMapping("/saveBenevole")
	public String saveBenevole(@ModelAttribute("benevole") Benevole benevole,@ModelAttribute("commune") Commune commune,
			@ModelAttribute("asc") Asc asc,ModelMap modelMap) {
		Benevole benevoleSaved = service.saveBenevole(benevole);
		benevoleSaved.setCommune(commune);
		benevoleSaved.setAsc(asc);		
		String msg = "Benevole saved with id :" + benevoleSaved.getId()+"à la commune"+commune.getNom()+"actif à l'ASC"+asc.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createBenevole";
	}

	@RequestMapping("/displayBenevoles")
	public String displayBenevoles(ModelMap modelMap) {

		List<Benevole> benevoles = service.getAllBenevoles();
		modelMap.addAttribute("benevoles", benevoles);
		return "displayBenevoles";
	}

	@RequestMapping("deleteBenevole")
	public String deleteBenevole(@RequestParam("id") Long id, ModelMap modelMap) {
		Benevole benevole = new Benevole();
		benevole.setId(id);
		service.deleteBenevole(benevole);
		List<Benevole> benevoles = service.getAllBenevoles();
		modelMap.addAttribute("benevoles", benevoles);
		return "displayBenevoles";
	}

	@RequestMapping("/showUpdateBenevole")
	public String showUpdateBenevole(@RequestParam("id") Long  id, ModelMap modelMap) {
		Benevole benevole = new Benevole();
		benevole.setId(id);
		modelMap.addAttribute("benevole", benevole);
		return "updateBenevole";
	}

	@RequestMapping("updateBenevole")
	public String updateBenevole(@ModelAttribute("benevole") Benevole benevole, ModelMap modelMap) {
		service.updateBenevole(benevole);
		List<Benevole> benevoles = service.getAllBenevoles();
		modelMap.addAttribute("benevoles", benevoles);
		return "displayBenevoles";
	}

	

	
	
}
