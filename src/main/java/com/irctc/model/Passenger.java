package com.irctc.model;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

@Service
public class Passenger {
	private BigInteger id;
	private String name;
	private int age;
	private char preference;
	private int status;
}
