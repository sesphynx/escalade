package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Dividende;
import org.nioun.essentials.service.DividendeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dividende")
public class DividendeController {


	@Autowired
	DividendeService service;
	

	@RequestMapping("/ajouterDividende")
	public String ajouterDividende(ModelMap map) {
		Dividende dividende = new Dividende();
		map.addAttribute(dividende);
		return "creerDividende";
	}

	@RequestMapping("/sauvegarderDividende")
	public String sauvegarderDividende(@ModelAttribute("dividende") Dividende dividende,
			ModelMap modelMap) {
		Dividende dividendeSaved = service.saveDividende(dividende);
		String msg = "Dividende sauvegarder avec l' id :" + dividendeSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerDividende";
	}

	@RequestMapping("/toutDividendes")
	public String toutDividendes(ModelMap modelMap) {

		List<Dividende> dividendes = service.getAllDividendes();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutDividendes";
	}

	@RequestMapping("supprimerDividende")
	public String supprimerDividende(@RequestParam("id") Long id, ModelMap modelMap) {
		Dividende dividende = new Dividende();
		dividende.setId(id);
		service.deleteDividende(dividende);
		List<Dividende> dividendes = service.getAllDividendes();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutDividendes";
	}

	@RequestMapping("/ciblerDividende")
	public String ciblerDividende(@RequestParam("id") Long  id, ModelMap modelMap) {
		Dividende dividende = new Dividende();
		dividende.setId(id);
		modelMap.addAttribute("dividende", dividende);
		return "ciblerDividende";
	}

	@RequestMapping("reglerDividende")
	public String reglerDividende(@ModelAttribute("dividende") Dividende dividende, ModelMap modelMap) {
		service.updateDividende(dividende);
		List<Dividende> dividendes = service.getAllDividendes();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutDividendes";
	}


}
