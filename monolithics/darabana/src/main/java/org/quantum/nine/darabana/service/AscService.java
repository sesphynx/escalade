package org.quantum.nine.darabana.service;

import java.util.List;

import org.quantum.nine.darabana.entities.Asc;

public interface AscService {
	
	Asc saveAsc(Asc asc);

	Asc updateAsc(Asc asc);

	void deleteAsc(Asc asc);

	Asc getAscById(Long id);

	List<Asc> getAllAscs();

}
