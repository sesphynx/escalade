package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.Parrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParrainRepository extends JpaRepository<Parrain, Long> {

}
