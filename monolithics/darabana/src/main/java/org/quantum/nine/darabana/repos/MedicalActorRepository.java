package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.MedicalActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalActorRepository extends JpaRepository<MedicalActor, Long> {

}
