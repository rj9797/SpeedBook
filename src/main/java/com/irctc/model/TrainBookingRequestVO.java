package com.irctc.model;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

public class TrainBookingRequestVO {
	private int trainId;
	private char gender;
	private String name;
	private int age;
	private char preference;
	private BigInteger userId;
	private int noOfPassengers;
	private String sourceStation;
	private int destinationStation;
	
	
	
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public int getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(int destinationStation) {
		this.destinationStation = destinationStation;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getPreference() {
		return preference;
	}
	public void setPreference(char preference) {
		this.preference = preference;
	}
	
	
}
