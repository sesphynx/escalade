package org.nioun.essentials.focalizer.controller;



import org.nioun.essentials.focalizer.model.GeoIP;
import org.nioun.essentials.focalizer.service.FocalizerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FocalizerController {
	
	@Autowired
	private FocalizerServiceImpl locationService;



	
	    
	    @PostMapping("/GeoIPTest")
	    public GeoIP getLocation(
	      @RequestParam(value="ipAddress", required=true) String ipAddress
	    ) throws Exception {
	      
	        return locationService.getLocation(ipAddress);
	    }
	
	    
	   
	   /*

	    @GetMapping("/map")
	    @ResponseBody
	    public List<UserGeoIPDTO> getAllUsersLocation() {
	        List <UserGeoIPDTO> usersLocation = locationService.getAllUsersLocation();
	        return usersLocation;
	    }

*/		


}
