package com.magma.quantum.corniche.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.corniche.entities.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club,Long> {

}
