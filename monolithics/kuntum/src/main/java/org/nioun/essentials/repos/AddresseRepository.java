package org.nioun.essentials.repos;


import org.nioun.essentials.entities.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresseRepository extends JpaRepository<Addresse , Long> {

}
