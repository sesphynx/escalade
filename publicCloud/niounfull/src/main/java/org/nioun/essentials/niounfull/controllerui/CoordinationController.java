package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Commune;
import org.nioun.essentials.niounfull.model.Coordination;
import org.nioun.essentials.niounfull.service.CommuneService;
import org.nioun.essentials.niounfull.service.CoordinationService;

@Controller
public class CoordinationController {


	@Autowired
	CoordinationService service;
	
	@Autowired
	CommuneService communeService;
	
			

	@RequestMapping("/showCreateCoordination")
	public String showCreateCoordination(ModelMap map) {
		Coordination coordination = new Coordination();
		map.addAttribute(coordination);
		List<Commune> communes = communeService.getAllCommunes();
		map.addAttribute("communes",communes);
		return "createCoordination";
	}

	@RequestMapping("/saveCoordination")
	public String saveCoordination(@ModelAttribute("coordination") Coordination coordination,@ModelAttribute("commune") Commune commune,
			ModelMap modelMap) {
		Coordination coordinationSaved = service.saveCoordination(coordination);
		coordinationSaved.setCommune(commune);
		String msg = "Coordination saved with id :" + coordinationSaved.getId()+"à la commune"+commune.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createCoordination";
	}

	@RequestMapping("/displayCoordinations")
	public String displayCoordinations(ModelMap modelMap) {

		List<Coordination> coordinations = service.getAllCoordinations();
		modelMap.addAttribute("coordinations", coordinations);
		return "displayCoordinations";
	}

	@RequestMapping("deleteCoordination")
	public String deleteCoordination(@RequestParam("id") Long id, ModelMap modelMap) {
		Coordination coordination = new Coordination();
		coordination.setId(id);
		service.deleteCoordination(coordination);
		List<Coordination> coordinations = service.getAllCoordinations();
		modelMap.addAttribute("coordinations", coordinations);
		return "displayCoordinations";
	}

	@RequestMapping("/showUpdateCoordination")
	public String showUpdateCoordination(@RequestParam("id") Long  id, ModelMap modelMap) {
		Coordination coordination = new Coordination();
		coordination.setId(id);
		modelMap.addAttribute("coordination", coordination);
		return "updateCoordination";
	}

	@RequestMapping("updateCoordination")
	public String updateCoordination(@ModelAttribute("coordination") Coordination coordination, ModelMap modelMap) {
		service.updateCoordination(coordination);
		List<Coordination> coordinations = service.getAllCoordinations();
		modelMap.addAttribute("coordinations", coordinations);
		return "displayCoordinations";
	}

	

}
