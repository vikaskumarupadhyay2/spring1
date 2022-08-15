package com.rest.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

	@GetMapping("/flight/{orgin}/{destination}")
	public ResponseEntity<List<Flight>> getOroginDestination(@PathVariable("origin") String origin,@PathVariable("destination") String destination) {
		
		List<Flight> flight = (List<Flight>) flightService.getFlightBySourceDetination(origin,destination);
		if (flight == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		List<Flight> flights = flight.stream()
				.sorted((o1, o2) -> o1.getDuration() - o2.getDuration())
				.collect(Collectors.toList());
		return ResponseEntity.of(Optional.of(flights));
	}



	@GetMapping("/flight/{flightNumber}")
	public ResponseEntity<List<Flight>> getFlight(@PathVariable("flightNumber") String flightNumber) {
		List<Flight> flight = (List<Flight>) flightService.getFlightById(flightNumber);
		if (flight == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		List<Flight> flights = flight.stream()
				.sorted((o1, o2) -> o1.getDuration() - o2.getDuration())
				.collect(Collectors.toList());
		return ResponseEntity.of(Optional.of(flight));
	}


}
