package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Acquisition;
import org.nioun.essentials.service.AcquisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/acquisition")
public class AcquisitionController {


	@Autowired
	AcquisitionService service;
	

	@RequestMapping("/ajouterAcquisition")
	public String ajouterAcquisition(ModelMap map) {
		Acquisition acquisition = new Acquisition();
		map.addAttribute(acquisition);
		return "creerAcquisition";
	}

	@RequestMapping("/sauvegarderAcquisition")
	public String sauvegarderAcquisition(@ModelAttribute("acquisition") Acquisition acquisition,
			ModelMap modelMap) {
		Acquisition acquisitionSaved = service.saveAcquisition(acquisition);
		String msg = "Acquisition sauvegarder avec l' id :" + acquisitionSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerAcquisition";
	}

	@RequestMapping("/toutAcquisitions")
	public String toutAcquisitions(ModelMap modelMap) {

		List<Acquisition> acquisitions = service.getAllAcquisitions();
		modelMap.addAttribute("acquisitions", acquisitions);
		return "toutAcquisitions";
	}

	@RequestMapping("supprimerAcquisition")
	public String supprimerAcquisition(@RequestParam("id") Long id, ModelMap modelMap) {
		Acquisition acquisition = new Acquisition();
		acquisition.setId(id);
		service.deleteAcquisition(acquisition);
		List<Acquisition> acquisitions = service.getAllAcquisitions();
		modelMap.addAttribute("acquisitions", acquisitions);
		return "toutAcquisitions";
	}

	@RequestMapping("/ciblerAcquisition")
	public String ciblerAcquisition(@RequestParam("id") Long  id, ModelMap modelMap) {
		Acquisition acquisition = new Acquisition();
		acquisition.setId(id);
		modelMap.addAttribute("acquisition", acquisition);
		return "ciblerAcquisition";
	}

	@RequestMapping("reglerAcquisition")
	public String reglerAcquisition(@ModelAttribute("acquisition") Acquisition acquisition, ModelMap modelMap) {
		service.updateAcquisition(acquisition);
		List<Acquisition> acquisitions = service.getAllAcquisitions();
		modelMap.addAttribute("acquisitions", acquisitions);
		return "toutAcquisitions";
	}


}
