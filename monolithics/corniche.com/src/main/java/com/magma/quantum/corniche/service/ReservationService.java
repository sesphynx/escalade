package com.magma.quantum.corniche.service;

import com.magma.quantum.corniche.dto.ReservationRequest;
import com.magma.quantum.corniche.entities.Reservationchambre;

public interface ReservationService {
	public Reservationchambre bookFlight(ReservationRequest request);

}
