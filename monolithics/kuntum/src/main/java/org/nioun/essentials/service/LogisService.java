package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Logis;

public interface LogisService {

	Logis saveLogis(Logis logis);

	Logis updateLogis(Logis logis);

	void deleteLogis(Logis logis);

	Logis getLogisById(Long id);

	List<Logis> getAllLogiss();
}
