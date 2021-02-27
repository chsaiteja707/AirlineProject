package com.sai.SBCore.service;

import java.util.List;

import com.sai.SBCore.entity.Flight;

public interface FlightService {
	public List<Flight> getFlightsByOriginAndDestination(String origin, String destination);

	public List<Flight> getFlightsByOriginDestinationAndDate(String origin, String destination, String date);

}
