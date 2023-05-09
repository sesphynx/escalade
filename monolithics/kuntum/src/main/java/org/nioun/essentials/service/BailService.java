package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Bail;

public interface BailService {
	
	Bail saveBail(Bail bail);

	Bail updateBail(Bail bail);

	void deleteBail(Bail bail);

	Bail getBailById(Long id);

	List<Bail> getAllBails();
}
