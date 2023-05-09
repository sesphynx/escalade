package com.magma.quantum.flightreservation.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.flightreservation.dto.ReservationRequest;
import com.magma.quantum.flightreservation.entities.Flight;
import com.magma.quantum.flightreservation.entities.Passenger;
import com.magma.quantum.flightreservation.entities.Reservation;
import com.magma.quantum.flightreservation.repos.FlightRepository;
import com.magma.quantum.flightreservation.repos.PassengerRepository;
import com.magma.quantum.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository ;
	
	@Autowired
	PassengerRepository passengerRepository ;
	
	@Autowired
	ReservationRepository reservationRepository ;
	
	public Reservation bookFlight (ReservationRequest request) {
		
		//make payment
		
		Long flightId = request.getFlightId();
		Flight  flight = flightRepository.getOne(flightId);
		
		Passenger passenger = new Passenger();
		passenger.setFirst_name(request.getPassengerFirstName());
		passenger.setLast_name(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		
		Passenger savedPassenger =  passengerRepository.saveAndFlush(passenger);
		 
		 Reservation reservation = new Reservation();
		 reservation.setFlight(flight);
		 reservation.setPassenger(savedPassenger);
		 reservation.setCheckedIn(false);
		 Reservation savedReservation = reservationRepository.saveAndFlush(reservation);
		
		
		return savedReservation;
	}

}
