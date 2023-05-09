package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Quartier;
import org.nioun.essentials.niounfull.model.Cellule;
import org.nioun.essentials.niounfull.service.QuartierService;
import org.nioun.essentials.niounfull.service.CelluleService;

@Controller
public class CelluleController {


	@Autowired
	CelluleService service;
	
	@Autowired
	QuartierService quartierService;
	
			

	@RequestMapping("/showCreateCellule")
	public String showCreateCellule(ModelMap map) {
		Cellule cellule = new Cellule();
		map.addAttribute(cellule);
		List<Quartier> quartiers = quartierService.getAllQuartiers();
		map.addAttribute("quartiers",quartiers);
		return "createCellule";
	}

	@RequestMapping("/saveCellule")
	public String saveCellule(@ModelAttribute("cellule") Cellule cellule,@ModelAttribute("quartier") Quartier quartier,
			ModelMap modelMap) {
		Cellule celluleSaved = service.saveCellule(cellule);
		celluleSaved.setQuartier(quartier);
		String msg = "Cellule saved with id :" + celluleSaved.getId()+"à la quartier"+quartier.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createCellule";
	}

	@RequestMapping("/displayCellules")
	public String displayCellules(ModelMap modelMap) {

		List<Cellule> cellules = service.getAllCellules();
		modelMap.addAttribute("cellules", cellules);
		return "displayCellules";
	}

	@RequestMapping("deleteCellule")
	public String deleteCellule(@RequestParam("id") Long id, ModelMap modelMap) {
		Cellule cellule = new Cellule();
		cellule.setId(id);
		service.deleteCellule(cellule);
		List<Cellule> cellules = service.getAllCellules();
		modelMap.addAttribute("cellules", cellules);
		return "displayCellules";
	}

	@RequestMapping("/showUpdateCellule")
	public String showUpdateCellule(@RequestParam("id") Long  id, ModelMap modelMap) {
		Cellule cellule = new Cellule();
		cellule.setId(id);
		modelMap.addAttribute("cellule", cellule);
		return "updateCellule";
	}

	@RequestMapping("updateCellule")
	public String updateCellule(@ModelAttribute("cellule") Cellule cellule, ModelMap modelMap) {
		service.updateCellule(cellule);
		List<Cellule> cellules = service.getAllCellules();
		modelMap.addAttribute("cellules", cellules);
		return "displayCellules";
	}

	

	
}
