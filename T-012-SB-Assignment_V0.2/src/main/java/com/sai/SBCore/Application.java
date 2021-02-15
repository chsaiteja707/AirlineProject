package com.sai.SBCore;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sai.SBCore.dao.AirlineInfoDAO;
//import com.sai.SBCore.dao.AirlineInfoDAO;
//import com.sai.SBCore.dao.AirlineInfoDAO;
import com.sai.SBCore.dao.FlightDAO;
import com.sai.SBCore.dao.FlightInfoDAO;
import com.sai.SBCore.entity.Flight;
import com.sai.SBCore.entity.FlightInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		ApplicationContext context=SpringApplication.run(Application.class, args);
		FlightDAO flight=context.getBean(FlightDAO.class);
		FlightInfoDAO  flightInfo=context.getBean(FlightInfoDAO.class);
		AirlineInfoDAO airlineInfo=context.getBean(AirlineInfoDAO.class);

//		airline Info Count				
//		System.out.println("count : "+airlineInfo.count());
		
//		count of flights from flight Info
//		System.out.println("count : "+flightInfo.count());
		
		
//		display flights based on flightInfo
//		ArrayList<FlightInfo> flightList=new ArrayList<>();
//		flightList=(ArrayList<FlightInfo>) flightInfo.findAll();
//		for(FlightInfo fi:flightList) {
//			System.out.println(fi.getFlightInfoId()+"==="+fi.getFlightNumber()+"==="+fi.getFlightType()+"==="+fi.getSeatCapacity());
//		}
		

//		List all flights flying from DELHI to CHENNAI on 2021-02-26 
//		ArrayList<Flight> flightList1=new ArrayList<>();
//		flightList1=(ArrayList<Flight>) flight.findOriginDestinationDate("DELHI","HYDERABAD");
//		for(Flight fl:flightList1) {
//			System.out.println(fl.getId()+"==="+fl.getOrigin()+"==="+fl.getDestination()+"==="+fl.getFlightDate()+"==="+fl.getFlightTime()+"==="+fl.getDuration());
//		}
		
//		List all flights with morethan 40 seats
//		ArrayList<FlightInfo> flightList1=new ArrayList<>();
//		flightList1=(ArrayList<FlightInfo>) flightInfo.findWithSeats();
//		for(FlightInfo fl:flightList1) {
//			System.out.println(fl.getSeatCapacity()+"==="+fl.getFlightNumber());
//		}
		
	
//		List all flights flying from DELHI to CHENNAI on 2021-02-26 with capacity > 40
//		ArrayList<Flight> flightList1=new ArrayList<>();
//		flightList1=(ArrayList<Flight>) flight.findOriginDestinationDateSeats();
//		for(Flight fl:flightList1) {
//			System.out.println(fl.getId()+"==="+fl.getOrigin()+"==="+fl.getDestination()+"==="+fl.getFlightDate()+"==="+fl.getFlightInfo().getSeatCapacity());
//		}
		
		
//		ArrayList<Flight> flightList1=new ArrayList<>();
//		flightList1=(ArrayList<Flight>) flight.findOriginDestinationDateSeatsFlightNumber();
//		for(Flight fl:flightList1) {
//			System.out.println(fl.getId()+"==="+fl.getOrigin()+"==="+fl.getDestination()+"==="+fl.getFlightDate()+"==="+fl.getFlightTime()+"==="+fl.getDuration()+"==="+fl.getFlightInfo().getFlightNumber());
//		}
		
		
//		list of all airlines with specifiy airline customer
//		ArrayList<Flight> flightList2=new ArrayList<>();
//		flightList2=(ArrayList<Flight>) flight.findOriginDestinationDateSeatsFlightNumberSpeficAirLine();
//		for(Flight fl:flightList2) {
//			System.out.println(fl.getId()+"==="+fl.getOrigin()+"==="+fl.getDestination()+"==="+fl.getFlightDate()+"==="+fl.getFlightTime()+"==="+fl.getDuration()+"==="+fl.getFlightInfo().getFlightNumber()+"==="+fl.getFlightInfo().getAirlineInfo().getAirlineName());
//		}
		
		
	}

}
