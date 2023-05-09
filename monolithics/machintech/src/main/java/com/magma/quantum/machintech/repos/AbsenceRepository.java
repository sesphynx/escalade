package com.magma.quantum.machintech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.machintech.entities.Absence;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Long> {

}
