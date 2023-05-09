package org.nioun.essentials.authorizationserver.repos;

import java.util.Optional;

import org.nioun.essentials.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<User,Long> {

	Optional<User> findByUsername(String username) ;
	
	
}
