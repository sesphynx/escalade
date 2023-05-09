package org.quantum.nine.darabana.repos;

import org.quantum.nine.darabana.entities.MedicalAct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalActRepository extends JpaRepository<MedicalAct, Long> {

}
