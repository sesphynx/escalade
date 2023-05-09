package org.nioun.essentials.causeservice.repos;


import org.nioun.essentials.niounsocial.Cause;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CauseRepository extends JpaRepository<Cause, Long> {

}
