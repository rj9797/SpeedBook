package com.irctc.model;

import java.math.BigInteger;

public class Route {
	private BigInteger id;
	private BigInteger trainId;
	private String routeNames;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getTrainId() {
		return trainId;
	}
	public void setTrainId(BigInteger trainId) {
		this.trainId = trainId;
	}
	public String getRouteNames() {
		return routeNames;
	}
	public void setRouteNames(String routeNames) {
		this.routeNames = routeNames;
	}
	@Override
	public String toString() {
		return "Route [id=" + id + ", trainId=" + trainId + ", routeNames=" + routeNames + "]";
	}
	
	
}
