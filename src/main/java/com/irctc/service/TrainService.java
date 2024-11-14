package com.irctc.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.irctc.model.Passenger;
import com.irctc.model.Train;
import com.irctc.model.TrainBookingRequestVO;
import com.irctc.repository.TrainDetailsDAO;

import lombok.extern.slf4j.Slf4j;

@Service
public class TrainService {
	int finalValue = 0;
	
	@Autowired
	TrainDetailsDAO dao;
	
	public int bookTicket(TrainBookingRequestVO bookingRequestVO) {
		
		Train train = null;
		try {
			return dao.bookTicket(passenger);
		}catch (Exception e) {
			e.printStackTrace();
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
