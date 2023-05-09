package org.nioun.essentials.addresseservice.repos;

import org.nioun.essentials.niouncore.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresseRepository extends JpaRepository<Addresse, Long> {

}
