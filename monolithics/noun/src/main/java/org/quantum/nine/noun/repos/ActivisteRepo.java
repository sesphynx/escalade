package org.quantum.nine.noun.repos;

import org.quantum.nine.noun.entities.Activiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivisteRepo extends JpaRepository<Activiste, Long> {

}
