package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.BailLogis;

public interface BailLogisService {

	BailLogis saveBailLogis(BailLogis bailLogis);

	BailLogis updateBailLogis(BailLogis bailLogis);

	void deleteBailLogis(BailLogis bailLogis);

	BailLogis getBailLogisById(Long id);

	List<BailLogis> getAllBailLogiss();
	
}
