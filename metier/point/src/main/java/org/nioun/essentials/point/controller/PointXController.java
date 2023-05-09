package org.nioun.essentials.point.controller;

import java.util.List;
import org.nioun.essentials.point.model.Point;
import org.nioun.essentials.point.repository.PointRepository;
import org.nioun.essentials.point.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PointXController {
	@Autowired
	PointService service;

	@Autowired
	PointRepository repository;




	@RequestMapping("/creerPoint")
	public String creerPoint(ModelMap map) {
		Point point= new Point();
		map.addAttribute(point);
		return "ajouterPoint";
	}

	@RequestMapping("/savePoint")
	public String savePoint(@ModelAttribute("point") Point point, ModelMap modelMap) {
		Point pointSaved = service.savePoint(point);
		String msg = "Point saved with id: " + pointSaved.getPointId();
		modelMap.addAttribute("msg", msg);
		/* emailUtil.sendEmail("mmdukb@hotmail.com", "Point Saved",
				"Point Saved Successfully and about to return a response");
		*/
		return "ajouterPoint";
	}

	@RequestMapping("/displayPoints")
	public String displayPoints(ModelMap modelMap) {
		List<Point> points = service.getAllPoints();
		modelMap.addAttribute("points", points);
		return "displayPoints";
	}

	@RequestMapping("deletePoint")
	public String deletePoint(@RequestParam("pointId") Long pointId, ModelMap modelMap) {
		 // Point Point = service.getPoint(PointId);
		Point point = new Point();
		point.setPointId(pointId);
		service.deletePoint(point);
		List<Point> points = service.getAllPoints();
		modelMap.addAttribute("points", points);
		return "displayPoints";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("pointId") Long pointId, ModelMap modelMap) {
		Point point = service.getPoint(pointId);
		modelMap.addAttribute("point", point);
		return "updatePoint";
	}

	@RequestMapping("/updatePoint")
	public String updatePoint(@ModelAttribute("point") Point point, ModelMap modelMap) {
		service.updatePoint(point);
		List<Point> points = service.getAllPoints();
		modelMap.addAttribute("points", points);
		return "afficherPoints";
	}


}
