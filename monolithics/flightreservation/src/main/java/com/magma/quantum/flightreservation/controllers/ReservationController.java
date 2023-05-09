package com.magma.quantum.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.flightreservation.dto.ReservationRequest;
import com.magma.quantum.flightreservation.entities.Flight;
import com.magma.quantum.flightreservation.entities.Reservation;
import com.magma.quantum.flightreservation.repos.FlightRepository;
import com.magma.quantum.flightreservation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository ;
	
	@Autowired
	ReservationService reservationService ;
	
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId , ModelMap modelMap ) {

		Flight  flight = flightRepository.getOne(flightId);
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}

	@RequestMapping(value="/completeReservation" , method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request , ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation have been created succesfully withid :"+reservation.getId());
		return "reservationConfirmation";
	}
	
}
