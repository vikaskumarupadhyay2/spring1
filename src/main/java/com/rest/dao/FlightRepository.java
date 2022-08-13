package com.rest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rest.entity.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, String>{
	
	public Flight findByFlight(String flightNumber);
	
	
	@Query("SELECT p from Flight p WHERE p.origin = :origin and p.destination = :destination")
	public Flight findBySourceDetination(@Param("origin") String origin,
            @Param("destination") String destination);

}
