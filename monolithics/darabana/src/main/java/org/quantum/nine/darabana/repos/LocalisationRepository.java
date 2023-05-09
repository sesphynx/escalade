package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalisationRepository extends JpaRepository<Localisation , Long> {

}
