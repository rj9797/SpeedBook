package com.irctc.model;

import java.math.BigInteger;
import java.sql.Date;

public class Ticket {
	private BigInteger id;
	private BigInteger routeId;
	private BigInteger trainId;
	private BigInteger userId;
	private int noOfPassengers;
	private String sourceStation;
	private int destinationStation;
	private Date bookedOnDate;
	private Date travelDate;
	private String email;
	private int contact;
	private float price;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getRouteId() {
		return routeId;
	}
	public void setRouteId(BigInteger routeId) {
		this.routeId = routeId;
	}
	public BigInteger getTrainId() {
		return trainId;
	}
	public void setTrainId(BigInteger trainId) {
		this.trainId = trainId;
	}
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
	public Date getBookedOnDate() {
		return bookedOnDate;
	}
	public void setBookedOnDate(Date bookedOnDate) {
		this.bookedOnDate = bookedOnDate;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
