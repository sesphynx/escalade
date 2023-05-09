package com.magma.quantum.machintech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.machintech.entities.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

}
