package org.nioun.essentials.assurance.controller;

import java.util.Arrays;
import java.util.List;

import org.nioun.essentials.assurance.model.Assurance;
import org.nioun.essentials.assurance.repository.AssuranceRepository;
import org.nioun.essentials.assurance.service.AssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssuranceXController {
	

	@Autowired
	AssuranceService service;

	@Autowired
	AssuranceRepository repository;
  
	
	@GetMapping("/assurance/index")
	public String showUserList(Model model) {
	    model.addAttribute("assurances", repository.findAll());
	    return "index";
	}
	
	
	@GetMapping("/assurance/creerAssurance")
    public String creerAssurance(Assurance assurance , Model model) {
		List<String> descriptions = Arrays.asList("collective","individuel","biens","activite");
		model.addAttribute("descriptions", descriptions);
		return "ajouterAssurance";
    }
    
	
    @PostMapping("/saveAssurance")
    public String saveAssurance(Assurance assurance, BindingResult result, Model model) {
                
        service.saveAssurance(assurance);
        return "redirect:/assurance/creerAssurance";
    }


	@GetMapping("/showUpdate/{assuranceId}")
    public String showUpdate(@PathVariable("assuranceId") long assuranceId, Model model) {
        Assurance assurance= repository.findById(assuranceId)
          .orElseThrow(() -> new IllegalArgumentException("Invalid  assuranceId:" + assuranceId));
        
        model.addAttribute("assurance", assurance);
        return "updateAssurance";
    }
    
	
	@PostMapping("/updateAssurance/{assuranceId}")
	public String updateAssurance(@PathVariable("assuranceId") long assuranceId, Assurance assurance, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	assurance.setAssuranceId(assuranceId);
	        return "updateAssurance";
	    }
	        
	    repository.save(assurance);
	    return "redirect:/index";
	}
	    
	@GetMapping("/delete/{assuranceId}")
	public String deleteAssurance(@PathVariable("assuranceId") long assuranceId, Model model) {
		Assurance assurance = repository.findById(assuranceId)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user assuranceId:" + assuranceId));
	    repository.delete(assurance);
	    return "redirect:/index";
	}

}
