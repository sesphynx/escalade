package org.quantum.nine.darabana.controllers;

import java.util.List;

import org.quantum.nine.darabana.entities.Parent;
import org.quantum.nine.darabana.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParentController {


	@Autowired
	ParentService service;
			

	@RequestMapping("/showCreateParent")
	public String showCreateParent(ModelMap map) {
		Parent parent = new Parent();
		map.addAttribute(parent);
		return "createParent";
	}

	@RequestMapping("/saveParent")
	public String saveParent(@ModelAttribute("parent") Parent parent, ModelMap modelMap) {
		Parent parentSaved = service.saveParent(parent);
		String msg = "Parent saved with id :" + parentSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createParent";
	}

	@RequestMapping("/displayParents")
	public String displayParents(ModelMap modelMap) {

		List<Parent> parents = service.getAllParents();
		modelMap.addAttribute("parents", parents);
		return "displayParents";
	}

	@RequestMapping("deleteParent")
	public String deleteParent(@RequestParam("id") Long id, ModelMap modelMap) {
		Parent parent = new Parent();
		parent.setId(id);
		service.deleteParent(parent);
		List<Parent> parents = service.getAllParents();
		modelMap.addAttribute("parents", parents);
		return "displayParents";
	}

	@RequestMapping("/showUpdateParent")
	public String showUpdateParent(@RequestParam("id") Long  id, ModelMap modelMap) {
		Parent parent = new Parent();
		parent.setId(id);
		modelMap.addAttribute("parent", parent);
		return "updateParent";
	}

	@RequestMapping("updateParent")
	public String updateParent(@ModelAttribute("parent") Parent parent, ModelMap modelMap) {
		service.updateParent(parent);
		List<Parent> parents = service.getAllParents();
		modelMap.addAttribute("parents", parents);
		return "displayParents";
	}

	

	
}
