package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.magma.quantum.machintech.entities.Codification;
import com.magma.quantum.machintech.repos.CodificationRepository;

@Controller
@RequestMapping("/codification")
public class CodificationController {

@Autowired
CodificationRepository codificationRepository ;


@GetMapping
public List<Codification> getCodifications() {
	return  codificationRepository.findAll();
}

@GetMapping("/{id}")
public Codification getCodification(@PathVariable("id") Long id ) {
	 return codificationRepository.getOne(id);
}


@PostMapping
public Codification creerCodification(Codification codification) {
	 return codificationRepository.saveAndFlush(codification);
}


@PutMapping
public Codification updateCodification(@RequestBody Codification codification) {
	return codificationRepository.save(codification);
}

@DeleteMapping("/{id}")
public void deleteCodification(@PathVariable("id") Long id){
	codificationRepository.deleteById(id);
}

}
