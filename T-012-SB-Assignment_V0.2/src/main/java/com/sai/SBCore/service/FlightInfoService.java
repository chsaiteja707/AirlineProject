package com.sai.SBCore.service;

import java.util.List;

import com.sai.SBCore.entity.FlightInfo;

public interface FlightInfoService {
	
	public List<FlightInfo> getFlightInfoBySeatCapacityGT(int number);

}
