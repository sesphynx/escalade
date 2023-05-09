package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Asc;
import org.quantum.nine.darabana.entities.Commune;
import org.quantum.nine.darabana.service.AscService;
import org.quantum.nine.darabana.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AscController {
	

	@Autowired
	AscService service;
	
	@Autowired
	CommuneService communeService;
			

	@RequestMapping("/showCreateAsc")
	public String showCreateAsc(ModelMap model) {
		Asc asc = new Asc();
		model.addAttribute(asc);
		List<Commune> communes = communeService.getAllCommunes();
		model.addAttribute("communes",communes);
		return "createAsc";
	}

	@RequestMapping("/saveAsc")
	public String saveAsc(@ModelAttribute("asc") Asc asc,@ModelAttribute("commune") Commune commune, ModelMap modelMap) {
		Asc ascSaved = service.saveAsc(asc);
		ascSaved.setCommune(commune);
		String msg = "Asc saved with id :" + ascSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createAsc";
	}

	@RequestMapping("/displayAscs")
	public String displayAscs(ModelMap modelMap) {

		List<Asc> ascs = service.getAllAscs();
		modelMap.addAttribute("ascs", ascs);
		return "displayAscs";
	}

	@RequestMapping("deleteAsc")
	public String deleteAsc(@RequestParam("id") Long id, ModelMap modelMap) {
		Asc asc = new Asc();
		asc.setId(id);
		service.deleteAsc(asc);
		List<Asc> ascs = service.getAllAscs();
		modelMap.addAttribute("ascs", ascs);
		return "displayAscs";
	}

	@RequestMapping("/showUpdateAsc")
	public String showUpdateAsc(@RequestParam("id") Long  id, ModelMap modelMap) {
		Asc asc = new Asc();
		asc.setId(id);
		modelMap.addAttribute("asc", asc);
		return "updateAsc";
	}

	@RequestMapping("updateAsc")
	public String updateAsc(@ModelAttribute("asc") Asc asc, ModelMap modelMap) {
		service.updateAsc(asc);
		List<Asc> ascs = service.getAllAscs();
		modelMap.addAttribute("ascs", ascs);
		return "displayAscs";
	}

	


}
