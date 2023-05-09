package org.quantum.nine.noun.controllers;

import org.quantum.nine.noun.entities.Activiste;
import org.quantum.nine.noun.repos.ActivisteRepo;
import org.quantum.nine.noun.service.ActivisteService;
import org.quantum.nine.noun.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActivisteController {

	@Autowired
	ActivisteService service;

	@Autowired
	ActivisteRepo repository;

	@Autowired
	EmailUtil emailUtil;

	@Autowired
	BCryptPasswordEncoder encoder ;
	
	@RequestMapping("/showcreate")
	public String showcreate() {
		return "createactiviste";
	}

	@RequestMapping(value = "saveActiviste", method = RequestMethod.POST)
	public String saveActiviste(@ModelAttribute("activiste") Activiste activiste, ModelMap modelMap) {
		
		Activiste activisteSaved = service.saveActiviste(activiste);
		String msg = "Activiste saved with id :" + activisteSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("mkebe1@yahoo.fr", "Activiste enregistré",
				"Activiste enregistré avec succès avec l ' id :" + activisteSaved.getId());
		return "showcreate";
	}

	@RequestMapping("/market")
	public String showMarket() {
		return "market";
	}
}
