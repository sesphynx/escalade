package org.nioun.essentials.causeservice.service;

import java.util.List;

import org.nioun.essentials.niounsocial.Cause;

public interface CauseService {

	Cause save(Cause cause);
	Cause   fetchById(Long causeId);
	List<Cause> fetchAllCauses();
}
