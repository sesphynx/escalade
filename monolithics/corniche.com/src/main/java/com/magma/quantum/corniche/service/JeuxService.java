package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.Jeux;

public interface JeuxService {
Jeux saveJeux(Jeux jeux);
Jeux updateJeux(Jeux jeux);
void deleteJeux(Jeux jeux);
Jeux getJeux(Long id);
List<Jeux> getAllJeuxs();
	
}
