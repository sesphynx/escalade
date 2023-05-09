package com.magma.quantum.flightreservation.repos;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.magma.quantum.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight , Long> {

	
@Query("from flights where departureCity:=departureCity and arrivalCity:= arrivalCity and dateofDeparture:=dateofDeparture")
public List<Flight> findFlights(@Param ("departureCity") String from, @Param ("arrivalCity") String to, @Param ("dateofDeparture") Date departureDate);
}
