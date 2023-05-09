package org.nioun.essentials.point.service;

import java.util.List;

import org.nioun.essentials.point.model.Point;

public interface PointService {

	
Point savePoint(Point point);

Point updatePoint(Point point);

void deletePoint(Point point);

Point	getPoint(Long id);

List<Point> getAllPoints();
	
}
