package org.nioun.essentials.naneurone.repository;

import org.nioun.essentials.naneurone.model.Naneurone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaneuroneRepository extends JpaRepository<Naneurone, Long>{

	Naneurone findByValeur(String valeur);
}
