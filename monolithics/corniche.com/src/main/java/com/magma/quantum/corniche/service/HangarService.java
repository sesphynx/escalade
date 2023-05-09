package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Hangar;

public interface HangarService {

	Hangar saveHangar(Hangar hangar);
	Hangar updateHangar(Hangar hangar);
	void deleteHangar(Hangar hangar);
	Hangar getHangar(Long id);
	List<Hangar> getAllHangars();
}
