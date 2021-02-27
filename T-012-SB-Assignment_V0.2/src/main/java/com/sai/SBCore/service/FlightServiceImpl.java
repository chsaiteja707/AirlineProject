package com.sai.SBCore.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.SBCore.dao.FlightDAO;
import com.sai.SBCore.entity.Flight;

@Service
public class FlightServiceImpl implements FlightService {
	
	private FlightDAO flightDAO;
	
	@Autowired
	public FlightServiceImpl(FlightDAO flightDAO) {
		this.flightDAO=flightDAO;
	}

	@Override
	@Transactional
	public List<Flight> getFlightsByOriginAndDestination(String origin, String destination) {
		return flightDAO.findFlightsByOriginLikeAndDestinationLike(origin, destination);
	}

	@Override
	@Transactional
	public List<Flight> getFlightsByOriginDestinationAndDate(String origin, String destination,
			String date) {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-d");
		String paramDate=date;
		LocalDate formattedDate=LocalDate.parse(paramDate,dtf);
		return flightDAO.findFlightsByOriginLikeAndDestinationLikeAndFlightDateEquals(origin, destination, formattedDate);
	}

}
