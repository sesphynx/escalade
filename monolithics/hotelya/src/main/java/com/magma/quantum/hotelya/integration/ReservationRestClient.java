package com.magma.quantum.hotelya.integration;

import com.magma.quantum.hotelya.integration.dto.Reservation;
import com.magma.quantum.hotelya.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
 public Reservation findReservation(Long id ) ;
 public Reservation updateReservation(ReservationUpdateRequest request);
}
