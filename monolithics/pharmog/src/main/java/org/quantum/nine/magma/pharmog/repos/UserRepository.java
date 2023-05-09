package org.quantum.nine.magma.pharmog.repos;

import org.quantum.nine.magma.pharmog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

User findByEmail(String email);

}
