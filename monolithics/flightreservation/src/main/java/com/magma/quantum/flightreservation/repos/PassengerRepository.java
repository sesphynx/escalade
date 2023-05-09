package com.magma.quantum.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magma.quantum.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
