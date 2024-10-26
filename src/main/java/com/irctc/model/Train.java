package com.irctc.model;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

public class Train {
    private BigInteger id;
    private String name;
    private Timestamp time;
    private String runsOn;
    private Date startTime;
    private int totalSeats;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getRunsOn() {
		return runsOn;
	}
	public void setRunsOn(String runsOn) {
		this.runsOn = runsOn;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", time=" + time + ", runsOn=" + runsOn + ", startTime="
				+ startTime + ", totalSeats=" + totalSeats + "]";
	}
    
}
