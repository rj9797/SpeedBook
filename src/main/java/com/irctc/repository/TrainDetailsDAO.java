package com.irctc.repository;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.irctc.model.Passenger;
import com.irctc.model.Ticket;
import com.irctc.model.Train;
import com.irctc.model.TrainBookingRequestVO;

@Repository
public class TrainDetailsDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	private SimpleJdbcCall simpleJdbcCall;

	public TrainDetailsDAO(JdbcTemplate jdbcTemplate) {
		this.simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("book_seat");
	}

	//PARAMETER NEEDS TO CAHNGE
	public int registerPassenger(Passenger passenger) {
		//		Train train = verifyTrain(trainBooking.getTrainId());
		//		Passenger passenger = requestVOToPasssengerVO(trainBooking);
		String sql = "INSERT INTO Passenger (PassengerID, Name, Age, Gender) VALUES (?, ?, ?, ?)";
		// Using jdbcTemplate to execute the insert
		return jdbcTemplate.update(sql, passenger.getId(), passenger.getName(), passenger.getAge(), passenger.getAge());
	}

	//NOT IN USE RN
	public Train verifyTrain(int trainId) {
		String sql = "select * from Train where trainId = ?";
		Train train = new Train();
		return jdbcTemplate.query(sql, new ResultSetExtractor<Train>() {

			@Override
			public Train extractData(ResultSet rs) throws SQLException, DataAccessException {
				train.setId(rs.getInt(trainId));
				train.setName(rs.getString("trainname"));
				train.setRunsOn(rs.getString("runson"));
				train.setTotalSeats(rs.getInt("totalseats"));
				return train;
			}

		},  new Object[] {trainId});
	}


	public void bookTicket(int train_id, BigInteger passengerid) {
		try {
			int passenger_id = passengerid.intValue();
			String sql = "CALL book_seat(?, ?)";
			jdbcTemplate.update(sql, train_id, passenger_id);

			//			simpleJdbcCall.execute(Map.of("train_id",train_id,
			//										  "passenger_id",passenger_id));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
