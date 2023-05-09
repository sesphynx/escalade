package org.quantum.nine.magma.pharmog.controllers;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CommandeComposante;
import org.quantum.nine.magma.pharmog.service.CommandeComposanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes
public class CommandeComposanteController {
	
	@Autowired
	CommandeComposanteService service ;
	
	@RequestMapping("/ajouterCommandeComposante")
	public String ajouterCommandeComposante(ModelMap map) {
		CommandeComposante commandeComposante = new CommandeComposante();
		map.addAttribute(commandeComposante);
		return "creerCommandeComposante";
	}

	@RequestMapping("/sauvegarderCommandeComposante")
	public String sauvegarderCommandeComposante(@ModelAttribute("commandeComposante") CommandeComposante commandeComposante,
							ModelMap modelMap) {
		CommandeComposante commandeComposanteSaved = service.saveCommandeComposante(commandeComposante);
		String msg = "CommandeComposante saved with id :" + commandeComposanteSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerCommandeComposante";
	}

	@RequestMapping("/toutCommandeComposantes")
	public String toutCommandeComposantes(ModelMap modelMap) {

		List<CommandeComposante> commandeComposantes = service.getAllCommandeComposantes();
		modelMap.addAttribute("commandeComposantes", commandeComposantes);
		return "toutCommandeComposantes";
	}

	@RequestMapping("supprimerCommandeComposante")
	public String supprimerCommandeComposante(@RequestParam("id") Long id, ModelMap modelMap) {
		CommandeComposante commandeComposante = new CommandeComposante();
		commandeComposante.setId(id);
		service.deleteCommandeComposante(commandeComposante);
		List<CommandeComposante> commandeComposantes = service.getAllCommandeComposantes();
		modelMap.addAttribute("commandeComposantes", commandeComposantes);
		return "toutCommandeComposantes";
	}

	@RequestMapping("/ciblerCommandeComposante")
	public String ciblerCommandeComposante(@RequestParam("id") Long  id, ModelMap modelMap) {
		CommandeComposante commandeComposante = new CommandeComposante();
		commandeComposante.setId(id);
		modelMap.addAttribute("commandeComposante", commandeComposante);
		return "ciblerCommandeComposante";
	}

	@RequestMapping("reglerCommandeComposante")
	public String reglerCommandeComposante(@ModelAttribute("commandeComposante") CommandeComposante commandeComposante, ModelMap modelMap) {
		service.updateCommandeComposante(commandeComposante);
		List<CommandeComposante> commandeComposantes = service.getAllCommandeComposantes();
		modelMap.addAttribute("commandeComposantes", commandeComposantes);
		return "toutCommandeComposantes";
	}

	
	
}
