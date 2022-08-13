package com.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, String>{
	
	public Flight findByFlight(String flightNumber);

}
