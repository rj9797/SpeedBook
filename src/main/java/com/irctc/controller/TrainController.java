package com.irctc.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.irctc.DTO.ReservationTicketDTO;
import com.irctc.model.Passenger;
import com.irctc.model.TrainBookingRequestVO;
import com.irctc.service.TrainService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/train-booking")
public class TrainController {

	@Autowired
	TrainService trainService;

	ObjectMapper mapper = new ObjectMapper();

	@PostMapping("/book-ticket")
	public ResponseEntity<String> bookTicket(@RequestBody String requestBody) {
		System.out.println("Inside the controller");
		try {
			TrainBookingRequestVO trainBookingRequestVO = mapper.readValue(requestBody, TrainBookingRequestVO.class);
			
			int num  = trainService.bookTicket(trainBookingRequestVO);
			return ResponseEntity.ok().body(String.valueOf(num));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body("Something went wrong!!!");
		}
	}
}
