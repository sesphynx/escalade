package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.BailLogis;
import org.nioun.essentials.service.BailLogisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dividende")
public class BailLogisController {


	@Autowired
	BailLogisService service;
	

	@RequestMapping("/ajouterBailLogis")
	public String ajouterBailLogis(ModelMap map) {
		BailLogis dividende = new BailLogis();
		map.addAttribute(dividende);
		return "creerBailLogis";
	}

	@RequestMapping("/sauvegarderBailLogis")
	public String sauvegarderBailLogis(@ModelAttribute("dividende") BailLogis dividende,
			ModelMap modelMap) {
		BailLogis dividendeSaved = service.saveBailLogis(dividende);
		String msg = "BailLogis sauvegarder avec l' id :" + dividendeSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerBailLogis";
	}

	@RequestMapping("/toutBailLogiss")
	public String toutBailLogiss(ModelMap modelMap) {

		List<BailLogis> dividendes = service.getAllBailLogiss();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutBailLogiss";
	}

	@RequestMapping("supprimerBailLogis")
	public String supprimerBailLogis(@RequestParam("id") Long id, ModelMap modelMap) {
		BailLogis dividende = new BailLogis();
		dividende.setId(id);
		service.deleteBailLogis(dividende);
		List<BailLogis> dividendes = service.getAllBailLogiss();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutBailLogiss";
	}

	@RequestMapping("/ciblerBailLogis")
	public String ciblerBailLogis(@RequestParam("id") Long  id, ModelMap modelMap) {
		BailLogis dividende = new BailLogis();
		dividende.setId(id);
		modelMap.addAttribute("dividende", dividende);
		return "ciblerBailLogis";
	}

	@RequestMapping("reglerBailLogis")
	public String reglerBailLogis(@ModelAttribute("dividende") BailLogis dividende, ModelMap modelMap) {
		service.updateBailLogis(dividende);
		List<BailLogis> dividendes = service.getAllBailLogiss();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutBailLogiss";
	}


}
