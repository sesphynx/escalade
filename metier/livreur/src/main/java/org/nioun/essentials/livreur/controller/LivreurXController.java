package org.nioun.essentials.livreur.controller;

import java.util.List;

import org.nioun.essentials.livreur.model.Livreur;
import org.nioun.essentials.livreur.repository.LivreurRepository;
import org.nioun.essentials.livreur.service.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LivreurXController {
	@Autowired
	LivreurService service;

	@Autowired
	LivreurRepository repository;



	@RequestMapping("/creerLivreur")
	public String creerLivreur(ModelMap map) {
		Livreur livreur= new Livreur();
		map.addAttribute(livreur);
		return "ajouterLivreur";
	}

	@RequestMapping("/saveLivreur")
	public String saveLivreur(@ModelAttribute("livreur") Livreur livreur, ModelMap modelMap) {
		Livreur livreurSaved = service.saveLivreur(livreur);
		String msg = "Livreur saved with id: " + livreurSaved.getLivreurId();
		modelMap.addAttribute("msg", msg);
		/* emailUtil.sendEmail("mmdukb@hotmail.com", "Livreur Saved",
				"Livreur Saved Successfully and about to return a response");
*/
		return "ajouterLivreur";
	}

	@RequestMapping("/displayLivreurs")
	public String displayLivreurs(ModelMap modelMap) {
		List<Livreur> livreurs = service.getAllLivreurs();
		modelMap.addAttribute("livreurs", livreurs);
		return "displayLivreurs";
	}

	@RequestMapping("deleteLivreur")
	public String deleteLivreur(@RequestParam("livreurId") Long livreurId, ModelMap modelMap) {
		 // Livreur Livreur = service.getLivreur(LivreurId);
		Livreur livreur = new Livreur();
		livreur.setLivreurId(livreurId);
		service.deleteLivreur(livreur);
		List<Livreur> livreurs = service.getAllLivreurs();
		modelMap.addAttribute("livreurs", livreurs);
		return "displayLivreurs";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("livreurId") Long livreurId, ModelMap modelMap) {
		Livreur livreur = service.getLivreur(livreurId);
		modelMap.addAttribute("livreur", livreur);
		return "updateLivreur";
	}

	@RequestMapping("/updateLivreur")
	public String updateLivreur(@ModelAttribute("livreur") Livreur livreur, ModelMap modelMap) {
		service.updateLivreur(livreur);
		List<Livreur> livreurs = service.getAllLivreurs();
		modelMap.addAttribute("livreurs", livreurs);
		return "afficherLivreurs";
	}


}
