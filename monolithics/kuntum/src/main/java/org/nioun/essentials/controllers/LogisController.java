package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Logis;
import org.nioun.essentials.service.LogisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/logis")
public class LogisController {


	@Autowired
	LogisService service;
	

	@RequestMapping("/ajouterLogis")
	public String ajouterLogis(ModelMap map) {
		Logis logis = new Logis();
		map.addAttribute(logis);
		return "creerLogis";
	}

	@RequestMapping("/sauvegarderLogis")
	public String sauvegarderLogis(@ModelAttribute("logis") Logis logis,
			ModelMap modelMap) {
		Logis logisSaved = service.saveLogis(logis);
		String msg = "Logis sauvegarder avec l' id :" + logisSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerLogis";
	}

	@RequestMapping("/toutLogiss")
	public String toutLogiss(ModelMap modelMap) {

		List<Logis> logiss = service.getAllLogiss();
		modelMap.addAttribute("logiss", logiss);
		return "toutLogiss";
	}

	@RequestMapping("supprimerLogis")
	public String supprimerLogis(@RequestParam("id") Long id, ModelMap modelMap) {
		Logis logis = new Logis();
		logis.setId(id);
		service.deleteLogis(logis);
		List<Logis> logiss = service.getAllLogiss();
		modelMap.addAttribute("logiss", logiss);
		return "toutLogiss";
	}

	@RequestMapping("/ciblerLogis")
	public String ciblerLogis(@RequestParam("id") Long  id, ModelMap modelMap) {
		Logis logis = new Logis();
		logis.setId(id);
		modelMap.addAttribute("logis", logis);
		return "ciblerLogis";
	}

	@RequestMapping("reglerLogis")
	public String reglerLogis(@ModelAttribute("logis") Logis logis, ModelMap modelMap) {
		service.updateLogis(logis);
		List<Logis> logiss = service.getAllLogiss();
		modelMap.addAttribute("logiss", logiss);
		return "toutLogiss";
	}


}
