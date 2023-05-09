package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Commune;
import org.quantum.nine.darabana.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommuneController {


	@Autowired
	CommuneService service;
			

	@RequestMapping("/showCreateCommune")
	public String showCreateCommune(ModelMap map) {
		Commune commune=new Commune();
		map.addAttribute(commune);
		return "createCommune";
	}

	@PostMapping("saveCommune")
	public String saveCommune(@ModelAttribute("commune") Commune commune, ModelMap modelMap) {
		Commune communeSaved = service.saveCommune(commune);
		String msg = "Commune saved with id :" + communeSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createCommune";
	}

	@RequestMapping("/displayCommunes")
	public String displayCommunes(ModelMap modelMap) {

		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}

	@RequestMapping("deleteCommune")
	public String deleteCommune(@RequestParam("id") Long id, ModelMap modelMap) {
		Commune commune = new Commune();
		commune.setId(id);
		service.deleteCommune(commune);
		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}
	@RequestMapping("deleteStraightCommune")
	public String deleteSraightCommune(@RequestParam("commune") Commune commune, ModelMap modelMap) {
		
		service.deleteCommune(commune);
		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}

	@RequestMapping("/showUpdateCommune")
	public String showUpdateCommune(@RequestParam("id") Long  id, ModelMap modelMap) {
		Commune commune = new Commune();
		commune.setId(id);
		modelMap.addAttribute("commune", commune);
		return "updateCommune";
	}

	@RequestMapping("updateCommune")
	public String updateCommune(@ModelAttribute("commune") Commune commune, ModelMap modelMap) {
		service.updateCommune(commune);
		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}

	

	
}
