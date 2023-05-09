package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet , Long> {

}
