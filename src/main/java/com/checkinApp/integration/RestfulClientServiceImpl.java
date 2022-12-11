package com.checkinApp.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.checkinApp.dto.Reservation;
import com.checkinApp.dto.UpdateReservation;
@Component
public class RestfulClientServiceImpl implements RestClientService {

	@Override
	public Reservation findReservationById(Long id) {
		RestTemplate rt=new RestTemplate();
		Reservation object = rt.getForObject("http://localhost:8080/flights/reservation/"+id,Reservation.class);
		return object;
	}

	@Override
	public Reservation updateReservation(UpdateReservation ur) {
		RestTemplate rt=new RestTemplate();
		rt.postForObject("http://localhost:8080/flights/reservation", ur, Reservation.class);
		return null;
	}

}
