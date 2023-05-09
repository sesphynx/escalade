package org.nioun.essentials.focalizer.service;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.nioun.essentials.focalizer.model.GeoIP;
import org.springframework.stereotype.Service;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;


@Service
public class FocalizerServiceImpl {
	
		private DatabaseReader dbReader;
		
		public FocalizerServiceImpl() throws IOException {
			File database = new File("C:\\Users\\mmduk\\eclipse-workspace\\focalizer\\src\\main\\resources\\static\\geolite2_city.mmdb");
			dbReader= new DatabaseReader.Builder(database).build();
			
		}
		
	    public GeoIP getLocation(String ip) 
	  	      throws IOException, GeoIp2Exception {
	  	        InetAddress ipAddress = InetAddress.getByName(ip);
	  	        CityResponse response = dbReader.city(ipAddress);
	  	        
	  	        String city = response.getCity().getName();
	  	        Double lat = 
	  	          response.getLocation().getLatitude();
	  	        Double lng = 
	  	          response.getLocation().getLongitude();
	  	       
	  	        return new GeoIP(ip , city , lat, lng );
	  	        
	  	    }

	}
	

