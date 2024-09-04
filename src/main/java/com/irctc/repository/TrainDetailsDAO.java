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
		},new ResultSetExtractor<Train>() {
			
			@Override
			public Train extractData(ResultSet rs) throws SQLException, DataAccessException {
				Train t = new Train();
				t.setName(rs.getString(""));
				return t;
			}
			
		});
		return null;
	}
}
