package org.nioun.essentials.chapiteauservice.service;

import java.util.List;

import org.nioun.essentials.niounsocial.Chapiteau;



public interface ChapiteauService {

	Chapiteau save(Chapiteau chapiteau);
	Chapiteau   fetchById(Long profileId);
	List<Chapiteau> fetchAllProfiles();
}
