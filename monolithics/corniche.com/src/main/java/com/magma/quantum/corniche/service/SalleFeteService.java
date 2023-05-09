package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.SalleFete;

public interface SalleFeteService {
	SalleFete saveSalleFete(SalleFete salleFete);
	SalleFete updateSalleFete(SalleFete salleFete);
	void deleteSalleFete(SalleFete salleFete);
	SalleFete getSalleFete(Long id);
	List<SalleFete> getAllSalleFetes();

}
