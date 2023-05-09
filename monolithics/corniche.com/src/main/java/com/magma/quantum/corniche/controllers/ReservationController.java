package com.magma.quantum.corniche.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.dto.ReservationRequest;
import com.magma.quantum.corniche.entities.Chambre;
import com.magma.quantum.corniche.entities.Reservationchambre;
import com.magma.quantum.corniche.repos.ChambreRepository;
import com.magma.quantum.corniche.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	ChambreRepository chambreRepository ;
	
	@Autowired
	ReservationService reservationService ;
	
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId , ModelMap modelMap ) {

		Chambre  chambre = chambreRepository.getOne(flightId);
		modelMap.addAttribute("flight", chambre);
		return "completeReservation";
	}

	@RequestMapping(value="/completeReservation" , method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request , ModelMap modelMap) {
		Reservationchambre reservationchambre = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservationchambre have been created succesfully withid :"+reservationchambre.getId());
		return "reservationConfirmation";
	}
	
}
