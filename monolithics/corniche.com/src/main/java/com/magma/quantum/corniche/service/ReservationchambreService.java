package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Reservationchambre;

public interface ReservationchambreService {
	
Reservationchambre saveReservationchambre(Reservationchambre reservationchambre);
Reservationchambre updateReservationchambre(Reservationchambre reservationchambre);
void deleteReservationchambre(Reservationchambre reservationchambre);
Reservationchambre getReservationchambre(Long id);
List<Reservationchambre> getAllReservationchambres();

}
