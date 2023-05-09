package org.quantum.nine.magma.pharmog.controllers;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Commande;
import org.quantum.nine.magma.pharmog.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes
public class CommandeController {
	
	@Autowired
	CommandeService service ;
	
	@RequestMapping("/ajouterCommande")
	public String ajouterCommande(ModelMap map) {
		Commande commande = new Commande();
		map.addAttribute(commande);
		return "creerCommande";
	}

	@RequestMapping("/sauvegarderCommande")
	public String sauvegarderCommande(@ModelAttribute("commande") Commande commande,
							ModelMap modelMap) {
		Commande commandeSaved = service.saveCommande(commande);
		String msg = "Commande saved with id :" + commandeSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "redirect:/ajouterCommande";
	}

	@RequestMapping("/toutCommandes")
	public String toutCommandes(ModelMap modelMap) {

		List<Commande> commandes = service.getAllCommandes();
		modelMap.addAttribute("commandes", commandes);
		return "toutCommandes";
	}

	@RequestMapping("supprimerCommande")
	public String supprimerCommande(@RequestParam("id") Long id, ModelMap modelMap) {
		Commande commande = new Commande();
		commande.setId(id);
		service.deleteCommande(commande);
		List<Commande> commandes = service.getAllCommandes();
		modelMap.addAttribute("commandes", commandes);
		return "toutCommandes";
	}

	@RequestMapping("/ciblerCommande")
	public String ciblerCommande(@RequestParam("id") Long  id, ModelMap modelMap) {
		Commande commande = new Commande();
		commande.setId(id);
		modelMap.addAttribute("commande", commande);
		return "ciblerCommande";
	}

	@RequestMapping("reglerCommande")
	public String reglerCommande(@ModelAttribute("commande") Commande commande, ModelMap modelMap) {
		service.updateCommande(commande);
		List<Commande> commandes = service.getAllCommandes();
		modelMap.addAttribute("commandes", commandes);
		return "toutCommandes";
	}

	
	
}
