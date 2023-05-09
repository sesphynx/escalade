package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Intervention;
import org.nioun.essentials.service.InterventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/intervention")
public class InterventionController {


	@Autowired
	InterventionService service;
	

	@RequestMapping("/ajouterIntervention")
	public String ajouterIntervention(ModelMap map) {
		Intervention intervention = new Intervention();
		map.addAttribute(intervention);
		return "creerIntervention";
	}

	@RequestMapping("/sauvegarderIntervention")
	public String saveIntervention(@ModelAttribute("intervention") Intervention intervention,
			ModelMap modelMap) {
		Intervention interventionSaved = service.saveIntervention(intervention);
		String msg = "Intervention sauvegarder avec l' id :" + interventionSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerIntervention";
	}

	@RequestMapping("/toutInterventions")
	public String toutInterventions(ModelMap modelMap) {

		List<Intervention> interventions = service.getAllInterventions();
		modelMap.addAttribute("interventions", interventions);
		return "toutInterventions";
	}

	@RequestMapping("supprimerIntervention")
	public String supprimerIntervention(@RequestParam("id") Long id, ModelMap modelMap) {
		Intervention intervention = new Intervention();
		intervention.setId(id);
		service.deleteIntervention(intervention);
		List<Intervention> interventions = service.getAllInterventions();
		modelMap.addAttribute("interventions", interventions);
		return "toutInterventions";
	}

	@RequestMapping("/ciblerIntervention")
	public String ciblerIntervention(@RequestParam("id") Long  id, ModelMap modelMap) {
		Intervention intervention = new Intervention();
		intervention.setId(id);
		modelMap.addAttribute("intervention", intervention);
		return "ciblerIntervention";
	}

	@RequestMapping("reglerIntervention")
	public String reglerIntervention(@ModelAttribute("intervention") Intervention intervention, ModelMap modelMap) {
		service.updateIntervention(intervention);
		List<Intervention> interventions = service.getAllInterventions();
		modelMap.addAttribute("interventions", interventions);
		return "toutInterventions";
	}


}
