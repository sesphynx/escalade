package org.kuntum.nine.magma.addresseservice.repos;

import org.nioun.essentials.core.model.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresseRepository extends JpaRepository<Addresse, Long> {

}
