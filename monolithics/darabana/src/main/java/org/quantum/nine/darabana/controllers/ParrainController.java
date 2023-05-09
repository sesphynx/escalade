package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Parrain;
import org.quantum.nine.darabana.service.ParrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParrainController {

	@Autowired
	ParrainService service;
			

	@RequestMapping("/showCreateParrain")
	public String showCreateParrain(ModelMap map) {
		Parrain parrain =new Parrain();
		map.addAttribute(parrain);
		return "createParrain";
	}

	@RequestMapping("/saveParrain")
	public String saveParrain(@ModelAttribute("parrain") Parrain parrain, ModelMap modelMap) {
		Parrain parrainSaved = service.saveParrain(parrain);
		String msg = "Parrain saved with id :" + parrainSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createParrain";
	}

	@RequestMapping("/displayParrains")
	public String displayParrains(ModelMap modelMap) {

		List<Parrain> parrains = service.getAllParrains();
		modelMap.addAttribute("parrains", parrains);
		return "displayParrains";
	}

	@RequestMapping("deleteParrain")
	public String deleteParrain(@RequestParam("id") Long id, ModelMap modelMap) {
		Parrain parrain = new Parrain();
		parrain.setId(id);
		service.deleteParrain(parrain);
		List<Parrain> parrains = service.getAllParrains();
		modelMap.addAttribute("parrains", parrains);
		return "displayParrains";
	}

	@RequestMapping("/showUpdateParrain")
	public String showUpdateParrain(@RequestParam("id") Long  id, ModelMap modelMap) {
		Parrain parrain = new Parrain();
		parrain.setId(id);
		modelMap.addAttribute("parrain", parrain);
		return "updateParrain";
	}

	@RequestMapping("updateParrain")
	public String updateParrain(@ModelAttribute("parrain") Parrain parrain, ModelMap modelMap) {
		service.updateParrain(parrain);
		List<Parrain> parrains = service.getAllParrains();
		modelMap.addAttribute("parrains", parrains);
		return "displayParrains";
	}

	

}
