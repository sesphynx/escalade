package org.quantum.nine.magma.pharmog.repos;


import org.quantum.nine.magma.pharmog.entities.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresseRepository extends JpaRepository<Addresse , Long> {

}
