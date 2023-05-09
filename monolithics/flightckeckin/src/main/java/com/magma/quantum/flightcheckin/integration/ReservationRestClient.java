package com.magma.quantum.flightcheckin.integration;

import com.magma.quantum.flightcheckin.integration.dto.Reservation;
import com.magma.quantum.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
 public Reservation findReservation(Long id ) ;
 public Reservation updateReservation(ReservationUpdateRequest request);
}
