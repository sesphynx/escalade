package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Bajeen;
import org.quantum.nine.darabana.entities.Commune;
import org.quantum.nine.darabana.service.BajeenService;
import org.quantum.nine.darabana.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BajeenController {


	@Autowired
	BajeenService service;
			
	@Autowired
	CommuneService communeService;

	@RequestMapping("/showCreateBajeen")
	public String showCreateBajeen(ModelMap map) {
		Bajeen  bajeen = new Bajeen();
		map.addAttribute(bajeen);
		List<Commune> communes = communeService.getAllCommunes();
		map.addAttribute("communes",communes);
		return "createBajeen";
	}

	@RequestMapping("/saveBajeen")
	public String saveBajeen(@ModelAttribute("bajeen") Bajeen bajeen, ModelMap modelMap) {
		Bajeen bajeenSaved = service.saveBajeen(bajeen);
		String msg = "Bajeen saved with id :" + bajeenSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createBajeen";
	}

	@RequestMapping("/displayBajeens")
	public String displayBajeens(ModelMap modelMap) {

		List<Bajeen> bajeens = service.getAllBajeens();
		modelMap.addAttribute("bajeens", bajeens);
		return "displayBajeens";
	}

	@RequestMapping("deleteBajeen")
	public String deleteBajeen(@RequestParam("id") Long id, ModelMap modelMap) {
		Bajeen bajeen = new Bajeen();
		bajeen.setId(id);
		service.deleteBajeen(bajeen);
		List<Bajeen> bajeens = service.getAllBajeens();
		modelMap.addAttribute("bajeens", bajeens);
		return "displayBajeens";
	}

	@RequestMapping("/showUpdateBajeen")
	public String showUpdateBajeen(@RequestParam("id") Long  id, ModelMap modelMap) {
		Bajeen bajeen = new Bajeen();
		bajeen.setId(id);
		modelMap.addAttribute("bajeen", bajeen);
		return "updateBajeen";
	}

	@RequestMapping("updateBajeen")
	public String updateBajeen(@ModelAttribute("bajeen") Bajeen bajeen, ModelMap modelMap) {
		service.updateBajeen(bajeen);
		List<Bajeen> bajeens = service.getAllBajeens();
		modelMap.addAttribute("bajeens", bajeens);
		return "displayBajeens";
	}

	

	
}
