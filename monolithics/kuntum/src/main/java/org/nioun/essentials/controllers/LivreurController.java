package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Livreur;
import org.nioun.essentials.repos.LivreurRepository;
import org.nioun.essentials.service.LivreurService;
import org.nioun.essentials.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/livreur")
public class LivreurController {

	@Autowired
	LivreurService service;

	@Autowired
	LivreurRepository repository;

	@Autowired
	EmailUtil emailUtil;

	@Autowired
	BCryptPasswordEncoder encoder ;
	
	@RequestMapping(value="/creerLivreur" , method=RequestMethod.GET)
	public String creerLivreur(ModelMap map) {
		Livreur livreur = new Livreur();
		map.addAttribute(livreur);
		return "creerLivreur";
	}

	
	@RequestMapping(value = "/sauvegarderLivreur", method = RequestMethod.POST)
	public String sauvegarderLivreur(@ModelAttribute("livreur") Livreur livreur, ModelMap modelMap) {
		
		Livreur livreurSaved = service.saveLivreur(livreur);
		String msg = "Livreur saved with id :" + livreurSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("mkebe1@yahoo.fr", "Livreur enregistré",
				"Livreur enregistré avec succès avec l ' id :" + livreurSaved.getId());
		return "creerLivreur";
	}

	@RequestMapping("/sauvegarderLivreur")
	public String saveLivreur(@ModelAttribute("livreur") Livreur livreur,
			ModelMap modelMap) {
		Livreur livreurSaved = service.saveLivreur(livreur);
		String msg = "Livreur sauvegarder avec l' id :" + livreurSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerLivreur";
	}

	@RequestMapping("/toutLivreurs")
	public String toutLivreurs(ModelMap modelMap) {

		List<Livreur> livreurs = service.getAllLivreurs();
		modelMap.addAttribute("livreurs", livreurs);
		return "livreurs";
	}

	@RequestMapping("supprimerLivreur")
	public String supprimerLivreur(@RequestParam("id") Long id, ModelMap modelMap) {
		Livreur livreur = new Livreur();
		livreur.setId(id);
		service.deleteLivreur(livreur);
		List<Livreur> livreurs = service.getAllLivreurs();
		modelMap.addAttribute("livreurs", livreurs);
		return "livreurs";
	}

	@RequestMapping("/ciblerLivreur")
	public String ciblerLivreur(@RequestParam("id") Long  id, ModelMap modelMap) {
		Livreur livreur = new Livreur();
		livreur.setId(id);
		modelMap.addAttribute("livreur", livreur);
		return "ciblerLivreur";
	}

	@RequestMapping("reglerLivreur")
	public String reglerLivreur(@ModelAttribute("livreur") Livreur livreur, ModelMap modelMap) {
		service.updateLivreur(livreur);
		List<Livreur> livreurs = service.getAllLivreurs();
		modelMap.addAttribute("livreurs", livreurs);
		return "livreurs";
	}

	
	@RequestMapping(path="/connectlivreur" , method=RequestMethod.GET)
	public String connectlivreur() {
		return "coreCorantic";
	}
}
