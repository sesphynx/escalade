package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Spa;

public interface SpaService {
	Spa saveSpa(Spa spa);
	Spa updateSpa(Spa spa);
	void deleteSpa(Spa spa);
	Spa getSpa(Long id);
	List<Spa> getAllSpas();

}
