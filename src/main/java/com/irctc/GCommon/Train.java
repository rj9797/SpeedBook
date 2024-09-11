package com.irctc.GCommon;

import java.util.Arrays;
import java.util.List;

public record Train(String id, String name, String UID){
	 private static List<Train> trains = Arrays.asList(
	            new Train("train-1", "rajdhani", "Raj_738"),
	            new Train("train-2", "shatabdi", "Shatab_892"),
	            new Train("train-3", "duranto", "Duranto_353")
	    );
	 
	 public static Train getById(String id) {
	        return trains.stream()
					.filter(train -> train.id().equals(id))
					.findFirst()
					.orElse(null);
	    }
}