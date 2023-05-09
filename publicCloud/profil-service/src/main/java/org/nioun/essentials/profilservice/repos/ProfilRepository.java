package org.nioun.essentials.profilservice.repos;

import org.nioun.essentials.core.niounmodel.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Customer, Long> {

}
