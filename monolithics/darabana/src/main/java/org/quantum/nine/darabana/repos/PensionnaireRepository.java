package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.Pensionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionnaireRepository extends JpaRepository<Pensionnaire, Long> {

}
