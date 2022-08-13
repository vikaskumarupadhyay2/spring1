package com.rest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.context.SpringBootTest; 
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rest.entity.Flight;
@SpringBootTest class FlightApplicationTests {

	@Autowired private TestRestTemplate restTemplate;

	@Test public void getBookingByValidId_OK() {

		String bookingId = "FB-10";

		ResponseEntity<Flight> bookingResponse =
				restTemplate.getForEntity(ApiUrls.FlightURL + bookingId,
						Flight.class);
		Assertions.assertThat(bookingResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(bookingResponse.getBody()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody().getFlightNumber()).isEqualTo(bookingId);
		Assertions.assertThat(bookingResponse.getBody().getDestination()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody().getDuration()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody().getOrigin()).isNotNull();

	}
}
