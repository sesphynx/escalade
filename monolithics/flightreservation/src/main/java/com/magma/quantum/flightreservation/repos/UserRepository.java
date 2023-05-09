package com.magma.quantum.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magma.quantum.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email) ;

}
