package com.magma.quantum.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magma.quantum.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
