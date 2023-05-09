package org.nioun.essentials.niounfull.controllerui;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.nioun.essentials.niounfull.model.Entite;
import org.nioun.essentials.niounfull.service.EntiteService;

@Controller
public class EntiteController {
	@Autowired
	EntiteService service;
	
	@RequestMapping("/showCreateEntite")
	public String showCreateEntite(ModelMap map) {
		Entite entite = new Entite();
		map.addAttribute(entite);
		return "createEntite";
	}

	@RequestMapping("/saveEntite")
	public String saveEntite(@ModelAttribute("entite") Entite entite,
			ModelMap modelMap) {
		Entite entiteSaved = service.saveEntite(entite);
		String msg = "Entite saved with id :" + entiteSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "createEntite";
	}

	@RequestMapping("/displayEntites")
	public String displayEntites(ModelMap modelMap) {

		List<Entite> entites = service.getAllEntites();
		modelMap.addAttribute("entites", entites);
		return "displayEntites";
	}

	@RequestMapping("deleteEntite")
	public String deleteEntite(@RequestParam("id") Long id, ModelMap modelMap) {
		Entite entite = new Entite();
		entite.setId(id);
		service.deleteEntite(entite);
		List<Entite> entites = service.getAllEntites();
		modelMap.addAttribute("entites", entites);
		return "displayEntites";
	}

	@RequestMapping("/showUpdateEntite")
	public String showUpdateEntite(@RequestParam("id") Long  id, ModelMap modelMap) {
		Entite entite = new Entite();
		entite.setId(id);
		modelMap.addAttribute("entite", entite);
		return "updateEntite";
	}

	@RequestMapping("updateEntite")
	public String updateEntite(@ModelAttribute("entite") Entite entite, ModelMap modelMap) {
		service.updateEntite(entite);
		List<Entite> entites = service.getAllEntites();
		modelMap.addAttribute("entites", entites);
		return "displayEntites";
	}

	

}
