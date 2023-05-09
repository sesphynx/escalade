package org.nioun.essentials.cercleservice.repos;


import org.nioun.essentials.niounsocial.Cercle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CercleRepository extends JpaRepository<Cercle, Long> {

}
