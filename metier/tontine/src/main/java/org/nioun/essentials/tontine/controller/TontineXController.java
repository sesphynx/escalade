package org.nioun.essentials.tontine.controller;

import org.nioun.essentials.tontine.model.Tontine;
import org.nioun.essentials.tontine.repository.TontineRepository;
import org.nioun.essentials.tontine.service.TontineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TontineXController {
	

	@Autowired
	TontineService service;

	@Autowired
	TontineRepository repository;
  
	
	@GetMapping("/tontine/index")
	public String showUserList(Model model) {
	    model.addAttribute("tontines", repository.findAll());
	    return "index";
	}
	
	
	@GetMapping("/tontine/creerTontine")
    public String creerTontine(Tontine tontine) {
        return "ajouterTontine";
    }
    
	
    @PostMapping("/saveTontine")
    public String saveTontine(Tontine tontine, BindingResult result, Model model) {
                
        service.saveTontine(tontine);
        return "redirect:/tontine/creerTontine";
    }


	@GetMapping("/showUpdate/{tontineId}")
    public String showUpdate(@PathVariable("tontineId") long tontineId, Model model) {
        Tontine tontine= repository.findById(tontineId)
          .orElseThrow(() -> new IllegalArgumentException("Invalid  tontineId:" + tontineId));
        
        model.addAttribute("tontine", tontine);
        return "updateTontine";
    }
    
	
	@PostMapping("/updateTontine/{tontineId}")
	public String updateTontine(@PathVariable("tontineId") long tontineId, Tontine tontine, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	tontine.setTontineId(tontineId);
	        return "updateTontine";
	    }
	        
	    repository.save(tontine);
	    return "redirect:/index";
	}
	    
	@GetMapping("/delete/{tontineId}")
	public String deleteUser(@PathVariable("tontineId") long tontineId, Model model) {
		Tontine tontine = repository.findById(tontineId)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user tontineId:" + tontineId));
	    repository.delete(tontine);
	    return "redirect:/index";
	}

}
