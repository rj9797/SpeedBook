package com.irctc.DTO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.irctc.model.Passenger;
import com.irctc.model.Train;

@Service
public class ReservationTicketDTO {
	private BigDecimal id;
	private BigDecimal userId;
//	private BigDecimal trainId;
	private Train train;
	private List<Passenger> passengerList;
	
}
