package org.nioun.essentials.caposervice.repos;


import org.nioun.essentials.niounsocial.Capo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapoRepository extends JpaRepository<Capo, Long> {

}
