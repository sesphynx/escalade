package com.magma.quantum.politicone.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.politicone.entities.Commune;

@Repository
public interface CommuneRepository extends JpaRepository<Commune,Long> {

}
