package com.rest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String flightNumber;
		
	@JsonManagedReference
	private Airport origin;
	
	@JsonManagedReference
	private Airport destination;
	
	private int duration;

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", duration=" + duration + "]";
	}

	public Flight(String flightNumber, Airport origin, Airport destination, int duration) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Airport getOrigin() {
		return origin;
	}

	public void setOrigin(Airport origin) {
		this.origin = origin;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

}
