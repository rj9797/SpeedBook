package com.irctc.model;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class Train {
    private BigInteger id;
    private String name;
    private Integer uid;
    private Timestamp time;
}
