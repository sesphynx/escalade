package org.nioun.essentials.point.controller;

import org.nioun.essentials.point.model.Point;
import org.nioun.essentials.point.repository.PointRepository;
import org.nioun.essentials.point.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointController {

	@Autowired
	PointRepository pointRepository ;
	
	@Autowired
	PointService pointService;

@GetMapping("/point/addresse/{addresse}")
public  Point	getPoint(@PathVariable String addresse ){
	 
	Point point = pointRepository.findByAddresse(addresse);
	
	if (point==null){
		
		throw new RuntimeException("Impossible de trouver le pointaunom de  "+addresse);
	}
	
	return  point;
	}

@GetMapping("/point/pointId/{pointId}")
public Point getPointById(@PathVariable Long pointId) {
	
	Point point = pointService.getPoint(pointId);
	return point;
}
	
}
