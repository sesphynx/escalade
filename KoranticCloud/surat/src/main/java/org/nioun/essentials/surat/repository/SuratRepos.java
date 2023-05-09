package org.nioun.essentials.surat.repository;

import org.nioun.essentials.surat.model.Surat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuratRepos extends JpaRepository<Surat,Long> {

	Surat findByOrdre(Integer ordre);
	
	Surat findByTour(String tour);
}
