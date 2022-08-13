/*
 * package com.rest;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.web.client.TestRestTemplate; import
 * org.springframework.http.ResponseEntity;
 * 
 * import com.dxbair.services.flightbooking.test.ApiUrls; import
 * com.dxbair.services.flightbooking.test.model.FlightBookingModel; import
 * com.rest.entity.Flight;
 * 
 * @SpringBootTest class FlightApplicationTests {
 * 
 * @Autowired private TestRestTemplate restTemplate;
 * 
 * @Test public void getBookingByValidId_OK() {
 * 
 * String bookingId = "FB-10";
 * 
 * ResponseEntity<Flight> bookingResponse =
 * restTemplate.getForEntity(ApiUrls.BookingURL + bookingId,
 * FlightBookingModel.class);
 * 
 * }
 */