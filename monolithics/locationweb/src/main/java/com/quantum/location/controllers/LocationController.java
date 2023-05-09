package com.quantum.location.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quantum.location.entities.Location;
import com.quantum.location.repos.LocationRepository;
import com.quantum.location.service.LocationService;
import com.quantum.location.util.EmailUtil;
import com.quantum.location.util.ReportUtil;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@Autowired
	LocationRepository repository;
	
	@Autowired
	ReportUtil reportUtil;

	@Autowired
	ServletContext sc ;
	
	@Autowired
	EmailUtil emailUtil;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Location saved with id :" + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("mkebe1@yahoo.fr", "Location Record",
				"Location have been saved successfully with id :" + locationSaved.getId());
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {

		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}

	@RequestMapping("updateLocation")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = sc.getRealPath("/");
		List<Object[]> data = repository.findTypeAndTypeCount();
		reportUtil.generatePieChart(path, data);
		return "report";
	}

}
