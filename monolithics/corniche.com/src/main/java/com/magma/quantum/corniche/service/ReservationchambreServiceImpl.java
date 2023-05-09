package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.Reservationchambre;
import com.magma.quantum.corniche.repos.ReservationchambreRepository;

@Service
public class ReservationchambreServiceImpl implements ReservationchambreService {

	@Autowired
	ReservationchambreRepository reservationchambreRepository; 
	
	
	
	public ReservationchambreRepository getReservationchambreRepository() {
		return reservationchambreRepository;
	}

	public void setReservationchambreRepository(ReservationchambreRepository reservationchambreRepository) {
		this.reservationchambreRepository = reservationchambreRepository;
	}

	public Reservationchambre saveReservationchambre(Reservationchambre reservationchambre) {
	
		return reservationchambreRepository.save(reservationchambre);
	}

	
	public Reservationchambre updateReservationchambre(Reservationchambre reservationchambre) {

		return reservationchambreRepository.save(reservationchambre);
	}

	
	public void deleteReservationchambre(Reservationchambre reservationchambre) {
reservationchambreRepository.delete(reservationchambre);
		
	}

	
	public Reservationchambre getReservationchambre(Long id) {

		return reservationchambreRepository.getOne(id);
	}


	public List<Reservationchambre> getAllReservationchambres() {

		return reservationchambreRepository.findAll();
	}

}
