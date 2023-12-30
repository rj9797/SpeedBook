package com.irctc.model;

import java.math.BigInteger;

import lombok.Data;

@Data
public class Train {
    private BigInteger id;
    private String name;
    private BigInteger uid;
    private Integer total_seats;
}
