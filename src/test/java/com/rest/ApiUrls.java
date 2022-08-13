package com.rest;

public enum ApiUrls {
	FlightURL("/flight/"),
	AirportURL("/flight/{}/{}");

	private String url;

	ApiUrls(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	
	@Override
	public String toString() {
		return this.url;
	}
}
