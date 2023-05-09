package org.nioun.essentials.verset.controller;

import java.util.List;

import org.nioun.essentials.verset.model.Verset;
import org.nioun.essentials.verset.repository.VersetRepository;
import org.nioun.essentials.verset.service.VersetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VersetXController {

	@Autowired
	VersetService service;

	@Autowired
	VersetRepository repository;


	@RequestMapping("/creerVerset")
	public String creerVerset(ModelMap map) {
		Verset verset= new Verset();
		map.addAttribute(verset);
		return "ajouterVerset";
	}

	@RequestMapping("/saveVerset")
	public String saveVerset(@ModelAttribute("verset") Verset verset, ModelMap modelMap) {
		Verset versetSaved = service.saveVerset(verset);
		String msg = "Verset saved with id: " + versetSaved.getVersetId();
		modelMap.addAttribute("msg", msg);
/*		 emailUtil.sendEmail("mmdukb@hotmail.com", "Verset Saved",
				"Verset Saved Successfully and about to return a response");
*/
		return "ajouterVerset";
	}

	@RequestMapping("/displayVersets")
	public String displayVersets(ModelMap modelMap) {
		List<Verset> versets = service.getAllVersets();
		modelMap.addAttribute("versets", versets);
		return "displayVersets";
	}

	@RequestMapping("deleteVerset")
	public String deleteVerset(@RequestParam("versetId") Long versetId, ModelMap modelMap) {
		 // Verset Verset = service.getVerset(VersetId);
		Verset verset = new Verset();
		verset.setVersetId(versetId);
		service.deleteVerset(verset);
		List<Verset> versets = service.getAllVersets();
		modelMap.addAttribute("versets", versets);
		return "displayVersets";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("versetId") Long versetId, ModelMap modelMap) {
		Verset verset = service.getVerset(versetId);
		modelMap.addAttribute("verset", verset);
		return "updateVerset";
	}

	@RequestMapping("/updateVerset")
	public String updateVerset(@ModelAttribute("verset") Verset verset, ModelMap modelMap) {
		service.updateVerset(verset);
		List<Verset> versets = service.getAllVersets();
		modelMap.addAttribute("versets", versets);
		return "afficherVersets";
	}


	
}
