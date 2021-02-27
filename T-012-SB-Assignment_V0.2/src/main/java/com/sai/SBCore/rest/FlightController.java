package com.sai.SBCore.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sai.SBCore.entity.Flight;
import com.sai.SBCore.service.FlightService;

@RestController
@CrossOrigin
public class FlightController {
	@Autowired
	 private FlightService flightService;
	
		
	public FlightController(FlightService flightService) {
		this.flightService=flightService;
	}
	
	@GetMapping(path = "/{origin}/{destination}")
	public List<Flight> getFlightsByOriginAndDestination(@PathVariable("origin") String origin, @PathVariable("destination") String destination){
		return this.flightService.getFlightsByOriginAndDestination(origin, destination);
	}
	
	@GetMapping(path = "/{origin}/{destination}/{date}")
	public List<Flight> getFlightsByOriginDestinationAndDate(@PathVariable("origin") String origin, @PathVariable("destination") String destination, @PathVariable("date") String date){
		return this.flightService.getFlightsByOriginDestinationAndDate(origin, destination, date);
	}
}
