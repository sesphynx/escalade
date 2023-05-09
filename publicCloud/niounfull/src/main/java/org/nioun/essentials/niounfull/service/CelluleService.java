package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Cellule;

public interface CelluleService {
	
	Cellule saveCellule(Cellule cellule);

	Cellule updateCellule(Cellule cellule);

	void deleteCellule(Cellule cellule);

	Cellule getCelluleById(Long id);

	List<Cellule> getAllCellules();


}
