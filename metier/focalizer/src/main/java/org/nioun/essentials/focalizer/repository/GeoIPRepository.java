package org.nioun.essentials.focalizer.repository;

import org.nioun.essentials.focalizer.model.GeoIP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoIPRepository extends JpaRepository<GeoIP, Long> {

}
