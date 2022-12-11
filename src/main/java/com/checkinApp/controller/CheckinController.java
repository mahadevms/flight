package com.checkinApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.checkinApp.dto.Reservation;
import com.checkinApp.dto.UpdateReservation;
import com.checkinApp.integration.RestClientService;

@Controller
public class CheckinController {
	@RequestMapping("/checkApp")
public String goToCheckinPage() {
		return "performCheckin";
	}
	
	@Autowired
	private RestClientService clientService;
	
	@RequestMapping("/checkin")
	public String getReservation(@RequestParam("id")Long id,ModelMap model) {
		Reservation reservation = clientService.findReservationById(id);
		model.addAttribute("reservation", reservation);
		return "passengerCheckinProcess";
	}
	@RequestMapping("/updateCheckin")
	public String updatePassengerDetails(@RequestParam("numberOfBags")int numberOfBags,@RequestParam("id")long id) {
		UpdateReservation ur=new UpdateReservation();
		ur.setCheckedIn(true);
		ur.setId(id);
		ur.setNumberOfBags(numberOfBags);
		clientService.updateReservation(ur);
		
		return "confirmation";
	}
}
