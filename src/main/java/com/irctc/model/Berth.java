package com.irctc.model;
import java.math.BigInteger;

import lombok.Data;

@Data
public class Berth {
	private BigInteger id;
	private int tierOneCount;
	private int tierTwoCount;
	private int tierThreeCount;
	private int generalCount;
	private int tierOnePrice;
	private int tierTwoPrice;
	private int tierThreePrice;
	private int generalPrice;
	private BigInteger trainUID;
}
