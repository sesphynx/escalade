package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Commune;
import com.magma.quantum.politicone.entities.Quartier;
import com.magma.quantum.politicone.service.CommuneService;
import com.magma.quantum.politicone.service.QuartierService;

@Controller
public class QuartierController {

	@Autowired
	QuartierService service;
	
	@Autowired
	CommuneService communeService;
	
			

	@RequestMapping("/showCreateQuartier")
	public String showCreateQuartier(ModelMap map) {
		Quartier quartier = new Quartier();
		map.addAttribute(quartier);
		List<Commune> communes = communeService.getAllCommunes();
		map.addAttribute("communes",communes);
		return "createQuartier";
	}

	@RequestMapping("/saveQuartier")
	public String saveQuartier(@ModelAttribute("quartier") Quartier quartier,@ModelAttribute("commune") Commune commune,
			ModelMap modelMap) {
		Quartier quartierSaved = service.saveQuartier(quartier);
		quartierSaved.setCommune(commune);
		String msg = "Quartier saved with id :" + quartierSaved.getId()+"à la commune"+commune.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createQuartier";
	}

	@RequestMapping("/displayQuartiers")
	public String displayQuartiers(ModelMap modelMap) {

		List<Quartier> quartiers = service.getAllQuartiers();
		modelMap.addAttribute("quartiers", quartiers);
		return "displayQuartiers";
	}

	@RequestMapping("deleteQuartier")
	public String deleteQuartier(@RequestParam("id") Long id, ModelMap modelMap) {
		Quartier quartier = new Quartier();
		quartier.setId(id);
		service.deleteQuartier(quartier);
		List<Quartier> quartiers = service.getAllQuartiers();
		modelMap.addAttribute("quartiers", quartiers);
		return "displayQuartiers";
	}

	@RequestMapping("/showUpdateQuartier")
	public String showUpdateQuartier(@RequestParam("id") Long  id, ModelMap modelMap) {
		Quartier quartier = new Quartier();
		quartier.setId(id);
		modelMap.addAttribute("quartier", quartier);
		return "updateQuartier";
	}

	@RequestMapping("updateQuartier")
	public String updateQuartier(@ModelAttribute("quartier") Quartier quartier, ModelMap modelMap) {
		service.updateQuartier(quartier);
		List<Quartier> quartiers = service.getAllQuartiers();
		modelMap.addAttribute("quartiers", quartiers);
		return "displayQuartiers";
	}

	
}
