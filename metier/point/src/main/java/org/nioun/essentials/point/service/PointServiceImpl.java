package org.nioun.essentials.point.service;

import java.util.List;

import org.nioun.essentials.point.model.Point;
import org.nioun.essentials.point.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointServiceImpl implements PointService {

	@Autowired
	PointRepository pointRepository;
	
	
	
	
	public PointRepository getPointRepository() {
		return pointRepository;
	}

	public void setPointRepository(PointRepository pointRepository) {
		this.pointRepository = pointRepository;
	}

	
	public Point savePoint(Point point) {
	
		return pointRepository.save(point);
	}

	
	public Point updatePoint(Point point) {

		return pointRepository.save(point);
	}

	
	public void deletePoint(Point point) {
		
		pointRepository.delete(point);
	}


	public Point getPoint(Long id) {

		return pointRepository.getById(id);
	}


	public List<Point> getAllPoints() {

		return pointRepository.findAll();
	}

}
