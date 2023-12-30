package com.irctc.DTO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.irctc.model.Passenger;

@Service
public class ReservationTicketDTO {
	private BigDecimal id;
	private BigDecimal userId;
	private BigDecimal trainId;
	private List<Passenger> passengerList;
	
}
