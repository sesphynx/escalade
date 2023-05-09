package com.magma.quantum.corniche.service;

import java.util.List;
import com.magma.quantum.corniche.entities.Club;


public interface ClubService  {

	Club saveClub(Club club);
	Club updateClub (Club club);
	void deleteClub(Club club) ;
	Club getClubById(Long id);
	List<Club> getAllClubs();

}
