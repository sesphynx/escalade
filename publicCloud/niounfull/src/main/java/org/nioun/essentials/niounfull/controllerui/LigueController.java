package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Pays;
import org.nioun.essentials.niounfull.model.Ligue;
import org.nioun.essentials.niounfull.service.PaysService;
import org.nioun.essentials.niounfull.service.LigueService;

@Controller
public class LigueController {


	@Autowired
	LigueService service;
	
	@Autowired
	PaysService paysService;
	
			

	@RequestMapping("/showCreateLigue")
	public String showCreateLigue(ModelMap map) {
		Ligue ligue = new Ligue();
		map.addAttribute(ligue);
		List<Pays> payss = paysService.getAllPayss();
		map.addAttribute("payss",payss);
		return "createLigue";
	}

	@RequestMapping("/saveLigue")
	public String saveLigue(@ModelAttribute("ligue") Ligue ligue,@ModelAttribute("pays") Pays pays,
			ModelMap modelMap) {
		Ligue ligueSaved = service.saveLigue(ligue);
		ligueSaved.setPays(pays);
		String msg = "Ligue saved with id :" + ligueSaved.getId()+"à la pays"+pays.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createLigue";
	}

	@RequestMapping("/displayLigues")
	public String displayLigues(ModelMap modelMap) {

		List<Ligue> ligues = service.getAllLigues();
		modelMap.addAttribute("ligues", ligues);
		return "displayLigues";
	}

	@RequestMapping("deleteLigue")
	public String deleteLigue(@RequestParam("id") Long id, ModelMap modelMap) {
		Ligue ligue = new Ligue();
		ligue.setId(id);
		service.deleteLigue(ligue);
		List<Ligue> ligues = service.getAllLigues();
		modelMap.addAttribute("ligues", ligues);
		return "displayLigues";
	}

	@RequestMapping("/showUpdateLigue")
	public String showUpdateLigue(@RequestParam("id") Long  id, ModelMap modelMap) {
		Ligue ligue = new Ligue();
		ligue.setId(id);
		modelMap.addAttribute("ligue", ligue);
		return "updateLigue";
	}

	@RequestMapping("updateLigue")
	public String updateLigue(@ModelAttribute("ligue") Ligue ligue, ModelMap modelMap) {
		service.updateLigue(ligue);
		List<Ligue> ligues = service.getAllLigues();
		modelMap.addAttribute("ligues", ligues);
		return "displayLigues";
	}

	


	
}
