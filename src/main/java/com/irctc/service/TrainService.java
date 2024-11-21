package com.irctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.irctc.model.Passenger;
import com.irctc.model.Train;
import com.irctc.model.TrainBookingRequestVO;
import com.irctc.repository.TrainDetailsDAO;

@Service
public class TrainService {
	int finalValue = 0;

	@Autowired
	TrainDetailsDAO dao;

	

	public int bookTicket(TrainBookingRequestVO bookingRequestVO) {
		try {
			dao.bookTicket(bookingRequestVO.getTrainId(),bookingRequestVO.getUserId());
			return 1;
		}catch (Exception e) {
			return 0;
		}
	}



	public Passenger requestVOToPasssengerVO(TrainBookingRequestVO requestVO) {
		Passenger passenger = new Passenger();
		passenger.setAge(requestVO.getAge());
		passenger.setGender(requestVO.getGender());
		passenger.setName(requestVO.getName());
		passenger.setPreference(requestVO.getPreference());
		return passenger;
	}
}
