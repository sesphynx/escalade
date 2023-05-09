package org.nioun.essentials.producteurservice.repos;

import org.nioun.essentials.niouncommerce.Producteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducteurRepository extends JpaRepository<Producteur, Long> {

}
