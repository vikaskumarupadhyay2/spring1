package com.rest.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.rest.dao.FlightRepository;
import com.rest.entity.Flight;

@Service
public class FlightService {

	private FlightRepository flightRepository;
	
	public Flight getFlightBySourceDetination(String origin,String destination) {
		Flight flight = null;
		try {
			flight=this.flightRepository.findBySourceDetination(origin, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flight;
	}


	public Flight getFlightById(String flightNumber) {
		Flight flight = null;
		try {
			flight=this.flightRepository.findByFlight(flightNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flight;
	}

}
