package com.magma.quantum.politicone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Cellule;
import com.magma.quantum.politicone.repos.CelluleRepository;

@Service
public class CelluleServiceImpl implements CelluleService {

	@Autowired
	CelluleRepository celluleRepository ;
	
	

	public CelluleRepository getCelluleRepository() {
		return celluleRepository;
	}

	public void setCelluleRepository(CelluleRepository celluleRepository) {
		this.celluleRepository = celluleRepository;
	}

	@Override
	public Cellule saveCellule(Cellule cellule) {

		return celluleRepository.save(cellule);
	}

	@Override
	public Cellule updateCellule(Cellule cellule) {
		return celluleRepository.save(cellule);
	}

	@Override
	public void deleteCellule(Cellule cellule) {
    celluleRepository.delete(cellule);

	}

	@Override
	public Cellule getCelluleById(Long id) {
		return celluleRepository.getOne(id);
	}

	@Override
	public List<Cellule> getAllCellules() {
		return celluleRepository.findAll();
	}

}
