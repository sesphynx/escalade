package org.quantum.nine.darabana.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.quantum.nine.darabana.entities.Daara;
import org.quantum.nine.darabana.entities.Localisation;
import org.quantum.nine.darabana.service.DaaraService;
import org.quantum.nine.darabana.service.LocalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DaaraController {
	
	@Autowired
	DaaraService service ;
	
	@Autowired
	LocalisationService locservice ;
	
	@RequestMapping(path="/showCreateDaara" , method=RequestMethod.GET)
	public String showCreateDaara(ModelMap modelmap) {
		Daara daara=new Daara();
		daara.setCouvertureMedicale("FALSE");
		modelmap.addAttribute(daara);
		modelmap.addAttribute("localisations", locservice.getAllLocalisations());
		
		List<String> radioCouvMedOptions= new LinkedList<>(Arrays.asList(new String [] {"TRUE","FALSE"}));
		modelmap.addAttribute("radioOptions", radioCouvMedOptions);		
		return "createDaara";
	}

	@RequestMapping(value = "savedaara", method = RequestMethod.POST)
	public String savedaara(@ModelAttribute("daara") Daara daara,@ModelAttribute("localisation") Localisation localisation, ModelMap modelMap) {
		Daara daaraSaved = new Daara();
		daaraSaved.setLocalisation(localisation);
		service.saveDaara(daaraSaved);
		String msg = "Daara saved with id :" + daaraSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "showCreateDaara";
	}
	
	@RequestMapping("/displayDaaras")
	public String displayDaaras(ModelMap modelMap) {

		List<Daara> daaras = service.getAllDaaras();
		modelMap.addAttribute("daaras", daaras);
		return "displayDaaras";
	}

	@RequestMapping("deleteDaara")
	public String deleteDaara(@RequestParam("id") Long id, ModelMap modelMap) {
		Daara daara = new Daara();
		daara.setId(id);
		service.deleteDaara(daara);
		List<Daara> daaras = service.getAllDaaras();
		modelMap.addAttribute("daaras", daaras);
		return "displayDaaras";
	}

	@RequestMapping("/showUpdate")
	public String showUpdateDaara(@RequestParam("id") Long  id, ModelMap modelMap) {
		Daara daara = new Daara();
		daara.setId(id);
		modelMap.addAttribute("daara", daara);
		return "updateDaara";
	}

	@RequestMapping("updateDaara")
	public String updateDaara(@ModelAttribute("daara") Daara daara, ModelMap modelMap) {
		service.updateDaara(daara);
		List<Daara> daaras = service.getAllDaaras();
		modelMap.addAttribute("daaras", daaras);
		return "displayDaaras";
	}
	
	
}
