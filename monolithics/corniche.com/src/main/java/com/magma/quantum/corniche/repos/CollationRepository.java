package com.magma.quantum.corniche.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.corniche.entities.Collation;

@Repository
public interface CollationRepository extends  JpaRepository<Collation,Long> {

}
