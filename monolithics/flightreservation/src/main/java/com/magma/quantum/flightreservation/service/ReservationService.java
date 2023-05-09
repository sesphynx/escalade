package com.magma.quantum.flightreservation.service;

import com.magma.quantum.flightreservation.dto.ReservationRequest;
import com.magma.quantum.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);

}
