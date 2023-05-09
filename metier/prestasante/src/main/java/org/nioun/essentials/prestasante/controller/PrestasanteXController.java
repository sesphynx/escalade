package org.nioun.essentials.prestasante.controller;

import java.util.Arrays;
import java.util.List;

import org.nioun.essentials.prestasante.model.Prestasante;
import org.nioun.essentials.prestasante.repository.PrestasanteRepository;
import org.nioun.essentials.prestasante.service.PrestasanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrestasanteXController {
	

	@Autowired
	PrestasanteService service;

	@Autowired
	PrestasanteRepository repository;
  
	
	@GetMapping("/prestasante/index")
	public String showUserList(Model model) {
	    model.addAttribute("prestasantes", repository.findAll());
	    return "index";
	}
	
	
	@GetMapping("/prestasante/creerPrestasante")
    public String creerPrestasante(Prestasante prestasante,Model model) {
		List<String> consultations = Arrays.asList("generale","maternite","cardiologie","radiologie");
        model.addAttribute("consultations", consultations);
		
		return "ajouterPrestasante";
    }
    
	
    @PostMapping("/savePrestasante")
    public String savePrestasante(Prestasante prestasante, BindingResult result, Model model) {
                
        service.savePrestasante(prestasante);
        return "redirect:/prestasante/creerPrestasante";
    }


	@GetMapping("/showUpdate/{prestasanteId}")
    public String showUpdate(@PathVariable("prestasanteId") long prestasanteId, Model model) {
        Prestasante prestasante= repository.findById(prestasanteId)
          .orElseThrow(() -> new IllegalArgumentException("Invalid  prestasanteId:" + prestasanteId));
        
        model.addAttribute("prestasante", prestasante);
        return "updatePrestasante";
    }
    
	
	@PostMapping("/updatePrestasante/{prestasanteId}")
	public String updatePrestasante(@PathVariable("prestasanteId") long prestasanteId, Prestasante prestasante, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	prestasante.setPrestasanteId(prestasanteId);
	        return "updatePrestasante";
	    }
	        
	    repository.save(prestasante);
	    return "redirect:/index";
	}
	    
	@GetMapping("/delete/{prestasanteId}")
	public String deleteUser(@PathVariable("prestasanteId") long prestasanteId, Model model) {
		Prestasante prestasante = repository.findById(prestasanteId)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user prestasanteId:" + prestasanteId));
	    repository.delete(prestasante);
	    return "redirect:/index";
	}

}
