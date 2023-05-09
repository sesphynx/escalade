package org.nioun.essentials.livreurservice.repos;


import org.nioun.essentials.niounlivraison.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur, Long> {

}
