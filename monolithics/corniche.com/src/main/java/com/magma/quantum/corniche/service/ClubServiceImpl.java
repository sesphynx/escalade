package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magma.quantum.corniche.entities.Club;
import com.magma.quantum.corniche.repos.ClubRepository;

public class ClubServiceImpl implements ClubService {

	@Autowired
	ClubRepository clubRepository ;
	
	
	
	
	public ClubRepository getClubRepository() {
		return clubRepository;
	}

	public void setClubRepository(ClubRepository clubRepository) {
		this.clubRepository = clubRepository;
	}

	@Override
	public Club saveClub(Club club) {
		return clubRepository.save(club);
	}

	@Override
	public Club updateClub(Club club) {
		return clubRepository.save(club);
	}

	@Override
	public void deleteClub(Club club) {
		clubRepository.delete(club);

	}

	@Override
	public Club getClubById(Long id) {
		return clubRepository.findOne(id);
	}

	@Override
	public List<Club> getAllClubs() {
		return clubRepository.findAll();
	}

}
