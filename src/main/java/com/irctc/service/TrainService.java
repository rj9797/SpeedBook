package com.irctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.model.Passenger;
import com.irctc.model.Train;
import com.irctc.repository.TrainDetailsDAO;

@Service
public class TrainService {
	int finalValue = 0;
	
	@Autowired
	TrainDetailsDAO dao;
	
	public int getTrainDetailsByName(Passenger passenger) {
		Train train = null;
		try {
			return dao.bookTicket(passenger);
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
