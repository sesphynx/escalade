package com.magma.quantum.machintech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.machintech.entities.Prospectus;

@Repository
public interface ProspectusRepository extends JpaRepository<Prospectus, Long> {

}
