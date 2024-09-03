package com.irctc.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.irctc.model.Train;

@Repository
public class TrainDetailsDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Train getTrainDetailsByName(String name) {
		jdbcTemplate.update("",new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, name);
				
			}
		});
		return null;
	}
}
