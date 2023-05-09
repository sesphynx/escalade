package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Commune;
import org.quantum.nine.darabana.entities.Localisation;
import org.quantum.nine.darabana.service.CommuneService;
import org.quantum.nine.darabana.service.LocalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LocalisationController {
	
		@Autowired
		LocalisationService service;
		

		@Autowired
		CommuneService communeService;
		
		
		
		
		@GetMapping("/showCreateLocalisation")
		public String showCreateLocalisation(ModelMap modelMap) {
			Localisation  localisation = new Localisation();
			modelMap.addAttribute(localisation);
			List<Commune> communes = communeService.getAllCommunes();
			modelMap.addAttribute("communes",communes);
			return "createLocalisation";
		}

		@PostMapping("/saveLocalisation")
		public String saveLocalisation(@ModelAttribute("localisation") Localisation localisation,
				@ModelAttribute("commune") Commune commune, ModelMap modelMap) {
			localisation.setCommune(commune);
			Localisation localisationSaved = new Localisation();
			localisationSaved = service.saveLocalisation(localisation);
			
			String msg = "Localisation saved with id :" + localisationSaved.getId() + "Commune id" + commune.getId();
			modelMap.addAttribute("msg", msg);
			return "createLocalisation";
		}

		@RequestMapping("/displayLocalisations")
		public String displayLocalisations(ModelMap modelMap) {

			List<Localisation> localisations = service.getAllLocalisations();
			modelMap.addAttribute("localisations", localisations);
			return "displayLocalisations";
		}

		@RequestMapping("deleteLocalisation")
		public String deleteLocalisation(@RequestParam("id") Long id, ModelMap modelMap) {
			Localisation localisation = new Localisation();
			localisation.setId(id);
			service.deleteLocalisation(localisation);
			List<Localisation> localisations = service.getAllLocalisations();
			modelMap.addAttribute("localisations", localisations);
			return "displayLocalisations";
		}

		@RequestMapping("/showUpdateLocalisation")
		public String showUpdateLocalisation(@RequestParam("id") Long  id, ModelMap modelMap) {
			Localisation localisation = new Localisation();
			localisation.setId(id);
			modelMap.addAttribute("localisation", localisation);
			return "updateLocalisation";
		}

		@RequestMapping("updateLocalisation")
		public String updateLocalisation(@ModelAttribute("localisation") Localisation localisation, ModelMap modelMap) {
			service.updateLocalisation(localisation);
			List<Localisation> localisations = service.getAllLocalisations();
			modelMap.addAttribute("localisations", localisations);
			return "displayLocalisations";
		}

		

}
