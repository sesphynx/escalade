package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Daara;
import org.quantum.nine.darabana.entities.Pensionnaire;
import org.quantum.nine.darabana.service.DaaraService;
import org.quantum.nine.darabana.service.PensionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PensionnaireController {


	@Autowired
	PensionnaireService service;
	@Autowired
	DaaraService serviceDaara;		

	@RequestMapping("/showCreatePensionnaire")
	public String showCreatePensionnaire(ModelMap model) {
		Pensionnaire pensionnaire = new Pensionnaire();
		model.addAttribute(pensionnaire);
		model.addAttribute("daaras",serviceDaara.getAllDaaras());
		return "createPensionnaire";
	}

	@RequestMapping("/savePensionnaire")
	public String savePensionnaire(@ModelAttribute("pensionnaire") Pensionnaire pensionnaire,
									@ModelAttribute("daara") Daara daara,
									ModelMap modelMap) {
		Pensionnaire pensionnaireSaved = service.savePensionnaire(pensionnaire);
		pensionnaireSaved.setDaara(daara);
		String msg = "Pensionnaire saved with id :" + pensionnaireSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createPensionnaire";
	}

	@RequestMapping("/displayPensionnaires")
	public String displayPensionnaires(ModelMap modelMap) {

		List<Pensionnaire> pensionnaires = service.getAllPensionnaires();
		modelMap.addAttribute("pensionnaires", pensionnaires);
		return "displayPensionnaires";
	}

	@RequestMapping("deletePensionnaire")
	public String deletePensionnaire(@RequestParam("id") Long id, ModelMap modelMap) {
		Pensionnaire pensionnaire = new Pensionnaire();
		pensionnaire.setId(id);
		service.deletePensionnaire(pensionnaire);
		List<Pensionnaire> pensionnaires = service.getAllPensionnaires();
		modelMap.addAttribute("pensionnaires", pensionnaires);
		return "displayPensionnaires";
	}

	@RequestMapping("/showUpdatePensionnaire")
	public String showUpdatePensionnaire(@RequestParam("id") Long  id, ModelMap modelMap) {
		Pensionnaire pensionnaire = new Pensionnaire();
		pensionnaire.setId(id);
		modelMap.addAttribute("pensionnaire", pensionnaire);
		return "updatePensionnaire";
	}

	@RequestMapping("updatePensionnaire")
	public String updatePensionnaire(@ModelAttribute("pensionnaire") Pensionnaire pensionnaire, ModelMap modelMap) {
		service.updatePensionnaire(pensionnaire);
		List<Pensionnaire> pensionnaires = service.getAllPensionnaires();
		modelMap.addAttribute("pensionnaires", pensionnaires);
		return "displayPensionnaires";
	}

	

	
}
