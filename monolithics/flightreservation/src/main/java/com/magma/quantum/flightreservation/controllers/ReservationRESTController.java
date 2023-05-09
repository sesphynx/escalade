package com.magma.quantum.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

import com.magma.quantum.flightreservation.dto.ReservationUpdateRequest;
import com.magma.quantum.flightreservation.entities.Reservation;
import com.magma.quantum.flightreservation.repos.ReservationRepository;

@RestController
public class ReservationRESTController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return reservationRepository.getOne(id);	
	}

	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody  ReservationUpdateRequest request) {
		 Reservation reservation = reservationRepository.getOne(request.getId());
		 reservation.setNumber_of_bags(request.getNumberOfBags());
		 reservation.setCheckedIn(request.isCheckedIn());
		 return reservationRepository.save(reservation);
		 
		 }
	
}
