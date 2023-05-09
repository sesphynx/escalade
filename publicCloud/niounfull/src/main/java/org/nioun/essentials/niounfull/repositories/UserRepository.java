package org.nioun.essentials.niounfull.repositories;

import org.nioun.essentials.niounfull.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email) ;

}
