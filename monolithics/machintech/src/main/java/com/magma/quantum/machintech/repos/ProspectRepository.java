package com.magma.quantum.machintech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.machintech.entities.Prospect;

@Repository
public interface ProspectRepository extends JpaRepository<Prospect, Long> {


}
