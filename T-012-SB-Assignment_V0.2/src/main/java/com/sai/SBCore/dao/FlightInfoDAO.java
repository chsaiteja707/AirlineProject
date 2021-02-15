package com.sai.SBCore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sai.SBCore.entity.FlightInfo;

public interface FlightInfoDAO extends JpaRepository<FlightInfo, Integer> {
	
	//if below error is encountered somewhere we are getting below exception.
//	Error creating bean with name 'airlineInfoDAO' defined in com.sai.SBCore.dao.AirlineInfoDAO defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Invocation of init method failed; nested exception is java.lang.IllegalArgumentException: Not a managed type: interface
	
	@Query("select f from FlightInfo f where (f.seatCapacity > 40)")
	public List<FlightInfo> findWithSeats();	
}
