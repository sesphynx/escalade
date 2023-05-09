package org.nioun.essentials.naneurone.service;

import java.util.List;

import org.nioun.essentials.naneurone.model.Naneurone;

public interface NaneuroneService {

	Naneurone saveNaneurone(Naneurone naneurone);
	
	Naneurone updateNaneurone(Naneurone naneurone);
	
	void deleteNaneurone(Naneurone naneurone);
	
	Naneurone getNaneurone(Long naneuroneId);
	
	List<Naneurone> getAllNaneurones();

	
}
