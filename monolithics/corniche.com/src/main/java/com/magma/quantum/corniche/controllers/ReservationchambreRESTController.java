package com.magma.quantum.corniche.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

import com.magma.quantum.corniche.dto.ReservationUpdateRequest;
import com.magma.quantum.corniche.entities.Reservationchambre;
import com.magma.quantum.corniche.repos.ReservationchambreRepository;

@RestController
public class ReservationchambreRESTController {
	
	@Autowired
	ReservationchambreRepository reservationchambreRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservationchambre findReservation(@PathVariable("id") Long id) {
		return reservationchambreRepository.findOne(id);	
	}

	@RequestMapping("/reservations")
	public Reservationchambre updateReservation(@RequestBody  ReservationUpdateRequest request) {
		 Reservationchambre reservationchambre = reservationchambreRepository.findOne(request.getId());
		 reservationchambre.setCheckedIn(request.isCheckedIn());
		 return reservationchambreRepository.save(reservationchambre);
		 
		 }
	
}
