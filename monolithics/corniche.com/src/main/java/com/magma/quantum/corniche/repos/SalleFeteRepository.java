package com.magma.quantum.corniche.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.corniche.entities.SalleFete;

@Repository
public interface SalleFeteRepository extends JpaRepository<SalleFete,Long> {

}
