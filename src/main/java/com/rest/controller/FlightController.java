package com.rest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.rest.entity.Flight;
import com.rest.service.FlightService;

@RestController
public class FlightController {

	private FlightService flightService;

	@GetMapping("/flights/OriginDestination")
	public ResponseEntity<List<Flight>> getBooks() {

		List<Flight> list = flightService.getOriginDestination();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}


	@GetMapping("/flight/{flightNumber}")
	public ResponseEntity<Flight> getBook(@PathVariable("flightNumber") String flightNumber) {
		Flight flight = flightService.getFlightById(flightNumber);
		if (flight == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(flight));
	}


}
