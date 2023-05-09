package org.nioun.essentials.point.repository;

import org.nioun.essentials.point.model.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<Point,Long> {

	Point findByAddresse(String addresse);
	
	Point  findByPhone(String phone);
	
}
