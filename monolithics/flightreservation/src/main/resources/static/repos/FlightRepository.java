package com.magma.quantum.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magma.quantum.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
