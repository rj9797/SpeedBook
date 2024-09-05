package com.irctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.model.Train;
import com.irctc.repository.TrainDetailsDAO;

@Service
public class TrainService {
	int finalValue = 0;
	
	@Autowired
	TrainDetailsDAO dao;
	
	public Train getTrainDetailsByName(String name) {
		Train train = null;
		try {
			train = dao.getTrainDetailsByName(name);
		}catch (Exception e) {
			throw e;
		}
		return train;
	}
}
