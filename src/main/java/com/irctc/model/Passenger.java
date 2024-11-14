package com.irctc.model;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import com.irctc.enums.StatusEnum;

@Service
public class Passenger {
	private BigInteger id;
	private BigInteger ticketId;
	private char gender;
	private String name;
	private int age;
	private char preference;
	private StatusEnum status;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getTicketId() {
		return ticketId;
	}
	public void setTicketId(BigInteger ticketId) {
		this.ticketId = ticketId;
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
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", ticketId=" + ticketId + ", gender=" + gender + ", name=" + name + ", age="
				+ age + ", preference=" + preference + ", status=" + status + "]";
	}
	
	
}
