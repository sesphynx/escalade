package org.nioun.essentials.proximusante.controller;

import java.util.List;

import org.nioun.essentials.proximusante.model.CaseSante;
import org.nioun.essentials.proximusante.service.CaseSanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casesante")
public class CaseSanteController {

	@Autowired
	private CaseSanteService caseSanteService;
	
	
	public List<CaseSante> findAll(){
		return caseSanteService.findAll();
	}
	
	@GetMapping(path = "/")
	public CaseSante findById(@RequestParam ("id") int id){
		try {
			return caseSanteService.findById(id);
		} catch (Exception e) {
			return null;
		}
	}


	@GetMapping(path="/caseSanteWithinSubCounty")
	public List<CaseSante> findCaseSanteWithinSubCounty(@RequestParam ("subCountyId") int subcountyId){
		return caseSanteService.findCaseSantesWithinSubCounty(subcountyId);
	}
	
	@GetMapping(path="/caseSanteByDistance")
	public List<CaseSante> findCaseSanteByDistanceFromUser(@RequestParam ("userLongitude") Double userLongitude ,
														   @RequestParam ("userLatitude") Double userLatitude){
		return caseSanteService.findCaseSantesByDistanceFromUser(userLongitude, userLatitude);
	}

	@DeleteMapping
	public void deleteCaseSante(int id){
		caseSanteService.deleteById(id);
	}
}
