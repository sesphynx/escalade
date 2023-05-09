package org.nioun.essentials.verset.repository;

import org.nioun.essentials.verset.model.Verset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersetRepository extends JpaRepository<Verset,Long> {

Verset	findByLibelle(String libelle);

Verset	findByExtraction(String extraction);

}
