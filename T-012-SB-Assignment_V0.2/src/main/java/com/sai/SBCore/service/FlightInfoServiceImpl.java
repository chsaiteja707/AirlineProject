package com.sai.SBCore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.SBCore.dao.FlightInfoDAO;
import com.sai.SBCore.entity.FlightInfo;

@Service
public class FlightInfoServiceImpl implements FlightInfoService {
	
	private FlightInfoDAO flightInfoDAO;
	
	@Autowired
	public FlightInfoServiceImpl(FlightInfoDAO flightInfoDAO) {
		// TODO Auto-generated constructor stub
		this.flightInfoDAO=flightInfoDAO;
	}

	@Override
	public List<FlightInfo> getFlightInfoBySeatCapacityGT(int number) {
		// TODO Auto-generated method stub
		return flightInfoDAO.findFlightInfoBySeatCapacityGreaterThan(number);
	}

}
