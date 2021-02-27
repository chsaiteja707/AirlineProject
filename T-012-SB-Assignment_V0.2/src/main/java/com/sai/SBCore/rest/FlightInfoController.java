package com.sai.SBCore.rest;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sai.SBCore.entity.FlightInfo;
import com.sai.SBCore.service.FlightInfoService;

@RestController
public class FlightInfoController {
	
	@Autowired
	private FlightInfoService flightInfoService;
	
	public FlightInfoController(FlightInfoService flightInfoService) {
		this.flightInfoService=flightInfoService;
	}
	
	@GetMapping("/flightinfo/capacity/{value}")
	@Transactional
	public List<FlightInfo> getFlightsInfoByCapacity(@PathVariable("value") int capacity){
		return this.flightInfoService.getFlightInfoBySeatCapacityGT(capacity);
	}
	
}
