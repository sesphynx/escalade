package org.nioun.essentials.proximusante.repository;

import java.util.List;

import org.nioun.essentials.proximusante.model.CaseSante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseSanteRepository extends JpaRepository<CaseSante, Integer> {

	@Query(value="SELECT cs.id , cs.name , cs.geom"
	+ "FROM case_sante cs,dakar_sub_counties dsc"
	+ "WHERe ST_Within(cs.geom,nsc.geom) and dsc.id= :subcountyId"
	, nativeQuery = true
	)
	List<CaseSante> findCaseSanteWithinSubCounty(@Param("subcountyId") int subcountyId);

	
	@Query(value="SELECT cs.id,cs.name,cs.geom,ST_Distance(cs.geom,ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326)) AS distance"
				+"FROM case_sante cs"
				+"ORDER BY cs.geom <-> ST_SetSRID(ST_Point(:userLongitude,:userlatitude),4326)"
				+"LIMIT 9"
				,nativeQuery = true)
	List<CaseSante> findAllHospitalsByDistanceFromUser(@Param("userLongitude") Double userLongitude 
														, @Param("userLatitude") Double userLatitude ) ;
}
