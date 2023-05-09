package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Piscine;

public interface PiscineService {

	Piscine savePiscine(Piscine piscine);
	Piscine updatePiscine(Piscine piscine);
	void deletePiscine(Piscine piscine);
	Piscine getPiscine(Long id);
	List<Piscine> getAllPiscines();
	
}
