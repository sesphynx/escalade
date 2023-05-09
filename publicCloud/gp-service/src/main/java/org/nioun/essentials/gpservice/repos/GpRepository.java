package org.nioun.essentials.gpservice.repos;


import org.nioun.essentials.niounlivraison.Gp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpRepository extends JpaRepository<Gp, Long> {

}
