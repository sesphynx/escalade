package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Entite;
import org.nioun.essentials.niounfull.model.Communication;
import org.nioun.essentials.niounfull.service.EntiteService;
import org.nioun.essentials.niounfull.service.CommunicationService;

@Controller
public class CommunicationController {

	@Autowired
	CommunicationService service;
	
	@Autowired
	EntiteService entiteService;
	
			

	@RequestMapping("/showCreateCommunication")
	public String showCreateCommunication(ModelMap map) {
		Communication communication = new Communication();
		map.addAttribute(communication);
		List<Entite> entites = entiteService.getAllEntites();
		map.addAttribute("entites",entites);
		return "createCommunication";
	}

	@RequestMapping("/saveCommunication")
	public String saveCommunication(@ModelAttribute("communication") Communication communication,@ModelAttribute("entite") Entite entite,
			ModelMap modelMap) {
		Communication communicationSaved = service.saveCommunication(communication);
		communicationSaved.setEntite(entite);
		String msg = "Communication saved with id :" + communicationSaved.getId()+"à la entite"+entite.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createCommunication";
	}

	@RequestMapping("/displayCommunications")
	public String displayCommunications(ModelMap modelMap) {

		List<Communication> communications = service.getAllCommunications();
		modelMap.addAttribute("communications", communications);
		return "displayCommunications";
	}

	@RequestMapping("deleteCommunication")
	public String deleteCommunication(@RequestParam("id") Long id, ModelMap modelMap) {
		Communication communication = new Communication();
		communication.setId(id);
		service.deleteCommunication(communication);
		List<Communication> communications = service.getAllCommunications();
		modelMap.addAttribute("communications", communications);
		return "displayCommunications";
	}

	@RequestMapping("/showUpdateCommunication")
	public String showUpdateCommunication(@RequestParam("id") Long  id, ModelMap modelMap) {
		Communication communication = new Communication();
		communication.setId(id);
		modelMap.addAttribute("communication", communication);
		return "updateCommunication";
	}

	@RequestMapping("updateCommunication")
	public String updateCommunication(@ModelAttribute("communication") Communication communication, ModelMap modelMap) {
		service.updateCommunication(communication);
		List<Communication> communications = service.getAllCommunications();
		modelMap.addAttribute("communications", communications);
		return "displayCommunications";
	}

	

}
