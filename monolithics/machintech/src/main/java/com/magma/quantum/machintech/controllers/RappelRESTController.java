package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magma.quantum.machintech.entities.Rappel;
import com.magma.quantum.machintech.repos.RappelRepository;


@RestController
@RequestMapping("/rappel")
public class RappelRESTController {

@Autowired
RappelRepository rappelRepository ;


@GetMapping
public List<Rappel> getRappels() {
	return  rappelRepository.findAll();
}

@GetMapping("/{id}")
public Rappel getRappel(@PathVariable ("id") Long id  ) {
	return rappelRepository.getOne(id);
}

@PostMapping
public Rappel creerRappel(Rappel rappel) {
	 return rappelRepository.save(rappel) ;
}


@PutMapping
public Rappel updateRappel(@RequestBody Rappel rappel) {
	return rappelRepository.save(rappel);
}

@DeleteMapping("/{rappelId}")
public void deleteRappel(@PathVariable("rappelId") Long rappelId){
	rappelRepository.deleteById(rappelId);
}



}
