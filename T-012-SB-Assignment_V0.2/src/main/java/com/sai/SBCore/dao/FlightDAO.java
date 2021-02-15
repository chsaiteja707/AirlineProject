package com.sai.SBCore.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sai.SBCore.entity.Flight;

public interface FlightDAO extends JpaRepository<Flight, Integer>{
	
	@Query("select f from Flight f where (f.origin=(:origin) and f.destination=(:destination) and f.flightDate='2021-02-26')")
	public List<Flight> findOriginDestinationDate(@Param("origin") String origin, @Param("destination") String destination);	
 
	@Query("select f from Flight f where (f.origin='DELHI' and f.destination='CHENNAI' and f.flightDate='2021-02-26' and f.flightInfo.seatCapacity > 40)")
	public List<Flight> findOriginDestinationDateSeats();
	
	@Query("select f from Flight f where (f.origin='DELHI' and f.destination='CHENNAI' and f.flightDate='2021-02-26' and f.flightInfo.flightNumber = 'AI-840')")
	public List<Flight> findOriginDestinationDateSeatsFlightNumber();
	
	@Query("select f from Flight f where (f.flightInfo.airlineInfo.airlineName='Air India')")
	public List<Flight> findOriginDestinationDateSeatsFlightNumberSpeficAirLine();

}
