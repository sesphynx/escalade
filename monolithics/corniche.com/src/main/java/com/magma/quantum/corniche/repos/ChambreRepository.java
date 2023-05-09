package com.magma.quantum.corniche.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magma.quantum.corniche.entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

}

