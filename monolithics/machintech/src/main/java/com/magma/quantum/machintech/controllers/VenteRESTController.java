package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magma.quantum.machintech.entities.Vente;
import com.magma.quantum.machintech.repos.VenteRepository;

@RestController
public class VenteRESTController {

@Autowired
VenteRepository venteRepository ;


@GetMapping
public List<Vente> getVentes() {
	return  venteRepository.findAll();
}

@GetMapping("/{id}")
public Vente getVente(@PathVariable("id") Long id ) {
	 return venteRepository.getOne(id);
}


@PostMapping
public Vente creerVente(Vente vente) {
	 return venteRepository.saveAndFlush(vente) ;
}


@PutMapping
public Vente updateVente(@RequestBody Vente vente) {
	return venteRepository.saveAndFlush(vente);
}

@DeleteMapping("/{id}")
public void deleteVente(@PathVariable("id") Long id){
	venteRepository.deleteById(id);
}



}
