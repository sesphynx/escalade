package org.nioun.essentials.prestasante.repository;

import org.nioun.essentials.prestasante.model.Prestasante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestasanteRepository extends JpaRepository<Prestasante, Long> {

 Prestasante findByDomaineAndConsultation(String domaine,String consultation);

 Prestasante findByDescription(String description);
 
 Prestasante findByConsultation(String consultation);
 
 Prestasante findByDomaine(String domaine);
 

}
