package com.magma.quantum.machintech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.machintech.entities.Rappel;

@Repository
public interface RappelRepository extends JpaRepository<Rappel, Long> {

}
