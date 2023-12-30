package com.irctc.controller;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.DTO.ReservationTicketDTO;

@RestController
@RequestMapping("/train-booking")
public class TrainController {
	public ResponseEntity<String> bookTicket(@RequestBody String requestBody) {
		String response = null;
		ReservationTicketDTO reservationDto = new ReservationTicketDTO();
		return ResponseEntity.ok().body(response);
	}
}
