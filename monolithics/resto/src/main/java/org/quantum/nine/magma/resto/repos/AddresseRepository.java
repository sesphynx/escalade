package org.quantum.nine.magma.resto.repos;


import org.quantum.nine.magma.resto.entities.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresseRepository extends JpaRepository<Addresse , Long> {

}
