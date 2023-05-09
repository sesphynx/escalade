package org.nioun.essentials.naneurone.controller;
	
import java.util.List;

import org.nioun.essentials.naneurone.model.Naneurone;
import org.nioun.essentials.naneurone.repository.NaneuroneRepository;
import org.nioun.essentials.naneurone.service.NaneuroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NaneuroneXController {

	@Autowired
	NaneuroneService service;

	@Autowired
	NaneuroneRepository repository;


	@RequestMapping("/creerNaneurone")
	public String creerNaneurone(ModelMap map) {
		Naneurone naneurone= new Naneurone();
		map.addAttribute(naneurone);
		return "ajouterNaneurone";
	}

	@RequestMapping("/saveNaneurone")
	public String saveNaneurone(@ModelAttribute("naneurone") Naneurone naneurone, ModelMap modelMap) {
		Naneurone naneuroneSaved = service.saveNaneurone(naneurone);
		String msg = "Naneurone saved with id: " + naneuroneSaved.getNaneuroneId();
		modelMap.addAttribute("msg", msg);
/*		 emailUtil.sendEmail("mmdukb@hotmail.com", "Naneurone Saved",
				"Naneurone Saved Successfully and about to return a response");
*/
		return "ajouterNaneurone";
	}

	@RequestMapping("/displayNaneurones")
	public String displayNaneurones(ModelMap modelMap) {
		List<Naneurone> naneurones = service.getAllNaneurones();
		modelMap.addAttribute("naneurones", naneurones);
		return "displayNaneurones";
	}

	@RequestMapping("deleteNaneurone")
	public String deleteNaneurone(@RequestParam("naneuroneId") Long naneuroneId, ModelMap modelMap) {
		 // Naneurone Naneurone = service.getNaneurone(NaneuroneId);
		Naneurone naneurone = new Naneurone();
		naneurone.setNaneuroneId(naneuroneId);
		service.deleteNaneurone(naneurone);
		List<Naneurone> naneurones = service.getAllNaneurones();
		modelMap.addAttribute("naneurones", naneurones);
		return "displayNaneurones";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("naneuroneId") Long naneuroneId, ModelMap modelMap) {
		Naneurone naneurone = service.getNaneurone(naneuroneId);
		modelMap.addAttribute("naneurone", naneurone);
		return "updateNaneurone";
	}

	@RequestMapping("/updateNaneurone")
	public String updateNaneurone(@ModelAttribute("naneurone") Naneurone naneurone, ModelMap modelMap) {
		service.updateNaneurone(naneurone);
		List<Naneurone> naneurones = service.getAllNaneurones();
		modelMap.addAttribute("naneurones", naneurones);
		return "afficherNaneurones";
	}


}
