package com.magma.quantum.politicone.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.politicone.entities.Communication;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, Long> {

}
