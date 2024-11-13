package com.irctc.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.irctc.model.Passenger;
import com.irctc.model.Train;

@Repository
public class TrainDetailsDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int bookTicket(Passenger passenger) {
		 String sql = "INSERT INTO Passenger (PassengerID, Name, Age, Gender) VALUES (?, ?, ?, ?)";
	        
	        // Using jdbcTemplate to execute the insert
	        return jdbcTemplate.update(sql, passenger.getId(), passenger.getName(), passenger.getAge(), passenger.getAge());
	}
}
