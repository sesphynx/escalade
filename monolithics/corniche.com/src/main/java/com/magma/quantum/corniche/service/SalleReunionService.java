package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.SalleReunion;

public interface SalleReunionService {
	SalleReunion saveSalleReunion(SalleReunion salleReunion);
	SalleReunion updateSalleReunion(SalleReunion salleReunion);
	void deleteSalleReunion(SalleReunion salleReunion);
	SalleReunion getSalleReunion(Long id);
	List<SalleReunion> getAllSalleReunions();
}
