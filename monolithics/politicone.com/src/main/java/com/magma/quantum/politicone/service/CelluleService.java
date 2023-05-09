package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Cellule;

public interface CelluleService {
	
	Cellule saveCellule(Cellule cellule);

	Cellule updateCellule(Cellule cellule);

	void deleteCellule(Cellule cellule);

	Cellule getCelluleById(Long id);

	List<Cellule> getAllCellules();


}
