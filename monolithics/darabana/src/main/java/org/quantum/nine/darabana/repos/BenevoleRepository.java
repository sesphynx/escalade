package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.Benevole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BenevoleRepository extends JpaRepository<Benevole, Long> {

}
