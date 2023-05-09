package com.magma.quantum.politicone.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.politicone.entities.Quartier;

@Repository
public interface QuartierRepository extends JpaRepository<Quartier, Long> {

}
