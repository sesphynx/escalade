package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Bail;
import org.nioun.essentials.service.BailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dividende")
public class BailController {


	@Autowired
	BailService service;
	

	@RequestMapping("/ajouterBail")
	public String ajouterBail(ModelMap map) {
		Bail dividende = new Bail();
		map.addAttribute(dividende);
		return "creerBail";
	}

	@RequestMapping("/sauvegarderBail")
	public String sauvegarderBail(@ModelAttribute("dividende") Bail dividende,
			ModelMap modelMap) {
		Bail dividendeSaved = service.saveBail(dividende);
		String msg = "Bail sauvegarder avec l' id :" + dividendeSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerBail";
	}

	@RequestMapping("/toutBails")
	public String toutBails(ModelMap modelMap) {

		List<Bail> dividendes = service.getAllBails();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutBails";
	}

	@RequestMapping("supprimerBail")
	public String supprimerBail(@RequestParam("id") Long id, ModelMap modelMap) {
		Bail dividende = new Bail();
		dividende.setId(id);
		service.deleteBail(dividende);
		List<Bail> dividendes = service.getAllBails();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutBails";
	}

	@RequestMapping("/ciblerBail")
	public String ciblerBail(@RequestParam("id") Long  id, ModelMap modelMap) {
		Bail dividende = new Bail();
		dividende.setId(id);
		modelMap.addAttribute("dividende", dividende);
		return "ciblerBail";
	}

	@RequestMapping("reglerBail")
	public String reglerBail(@ModelAttribute("dividende") Bail dividende, ModelMap modelMap) {
		service.updateBail(dividende);
		List<Bail> dividendes = service.getAllBails();
		modelMap.addAttribute("dividendes", dividendes);
		return "toutBails";
	}


}
