package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Parrain;

public interface ParrainService {

	public Parrain saveParrain(Parrain parrain);
	public Parrain updateParrain(Parrain parrain);
	public void deleteParrain(Parrain parrain);
	public Parrain getParrainById(Long id);
	public List<Parrain> getAllParrains();
}
