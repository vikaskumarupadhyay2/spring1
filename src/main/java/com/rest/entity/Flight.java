package com.rest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Flight {
	
	private String flightNumber;
	
	private int duration;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Airport airport;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", duration=" + duration + ", airport=" + airport + "]";
	}

	public Flight(String flightNumber, int duration, Airport airport) {
		super();
		this.flightNumber = flightNumber;
		this.duration = duration;
		this.airport = airport;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

}
