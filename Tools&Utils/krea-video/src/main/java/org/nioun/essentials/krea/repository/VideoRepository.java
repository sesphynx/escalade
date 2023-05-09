package org.nioun.essentials.krea.repository;

import java.util.List;

import org.nioun.essentials.krea.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
	
	Video findByName(String name);
	
	boolean existsByName(String name);
	
	@Query(nativeQuery=true , value="select name from video")
	List<String> getAllEntryNames();

}
