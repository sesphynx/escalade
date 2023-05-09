package org.nioun.essentials.krea.repository;

import java.util.List;

import org.nioun.essentials.krea.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioRepository extends JpaRepository<Audio, Long> {
	
	Audio findByName(String name);
	
	boolean existsByName(String name);
	
	@Query(nativeQuery=true , value="select name from video")
	List<String> getAllEntryNames();

}
