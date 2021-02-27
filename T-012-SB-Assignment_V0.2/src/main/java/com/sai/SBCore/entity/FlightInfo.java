package com.sai.SBCore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="flight_info")
public class FlightInfo {
		
	@Id
	@Column(name = "flight_infoid")
	private int flightInfoId;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "flight_infoid")
	private List<Flight> flights;
	
	@ManyToOne
	@JoinColumn(name = "airline_id")
	private AirlineInfo airlineInfo;
	
	
	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "flight_type")
	private String flightType;
	
	@Column(name = "seat_capacity")
	private int seatCapacity;
	
	
	
	@JsonBackReference
	public AirlineInfo getAirlineInfo() {
		return airlineInfo;
	}

	public void setAirlineInfo(AirlineInfo airlineInfo) {
		this.airlineInfo = airlineInfo;
	}

	public int getFlightInfoId() {
		return flightInfoId;
	}

	@JsonManagedReference
	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public void setFlightInfoId(int flightInfoId) {
		this.flightInfoId = flightInfoId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
}
