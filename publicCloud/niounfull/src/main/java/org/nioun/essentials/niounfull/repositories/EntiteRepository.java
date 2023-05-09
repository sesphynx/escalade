package org.nioun.essentials.niounfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.nioun.essentials.niounfull.model.Entite;

@Repository
public interface EntiteRepository extends JpaRepository<Entite, Long> {

}
