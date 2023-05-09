package org.nioun.essentials.assurance.repository;

import java.util.Date;

import org.nioun.essentials.assurance.model.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceRepository extends JpaRepository<Assurance, Long> {

 Assurance findByDescription(String description);
 
 Assurance findByLibelle(String libelle);
 
 Assurance findByDateDebut(Date dateDebut);
 
 Assurance findByDateFin(Date dateFin);
 

}
