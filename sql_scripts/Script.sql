CREATE TABLE train (
    TrainID SERIAL PRIMARY KEY,
    TrainName VARCHAR(255) NOT NULL,
    RunsOn DATE NOT NULL,
    StartTime TIME NOT NULL,
    TotalSeats INT NOT NULL
);
CREATE TABLE booked_ticket (
    ticket_id SERIAL PRIMARY KEY,   -- Auto-generated ticket ID
    train_id INT NOT NULL,          -- ID of the train
    passenger_id INT NOT NULL,      -- ID of the passenger
    status VARCHAR(20) NOT NULL,    -- Booking status (e.g., Booked, Waiting, RAC)
    berth VARCHAR(10),              -- Berth type (e.g., Lower, Middle, Upper, etc.)
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP  -- Optional: timestamp of booking
);
select * from booked_ticket;

select * from train;

INSERT INTO train (TrainName, RunsOn, StartTime, TotalSeats)
VALUES
    ('Express 101', '2024-11-15', '08:30:00', 200),
    ('Local 202', '2024-11-16', '09:00:00', 150),
    ('SuperFast 303', '2024-11-17', '10:15:00', 300),
    ('Night Rider 404', '2024-11-18', '23:45:00', 100);
    
   CREATE TABLE Passenger (
    TicketID SERIAL PRIMARY KEY,
    PassengerID INT NOT NULL,
    Name VARCHAR(255) NOT NULL,
    Age INT NOT NULL,
    Gender CHAR(1) NOT NULL CHECK (Gender IN ('M', 'F', 'O')) -- 'M' = Male, 'F' = Female, 'O' = Other
);


select * from passenger;
select * from Train;
select * from train where trainid = 1;



CREATE OR REPLACE PROCEDURE book_seat(train_id INT, passenger_id INT)
LANGUAGE plpgsql
AS $$
DECLARE
    available_seats INT;
BEGIN
    -- Check available seats
    SELECT seats_left INTO available_seats
    FROM train
    WHERE train_id = book_seat.train_id;

	UPDATE train
    SET seats_left = seats_left - 1
    WHERE train_id = book_seat.train_id;
        

    -- If seats are available, proceed with booking
    IF available_seats > 0 THEN
        -- Update seats in the train table
        
        -- Insert booking information in the passenger_status table
        INSERT INTO booked_ticket (book_seat.train_id, book_seat.passenger_id, status)
        VALUES (book_seat.train_id, passenger_id, 'Confirmed');
    ELSE
        -- Insert a waiting list status if no seats are available
        INSERT INTO passenger_status (book_seat.train_id, book_seat.passenger_id, status)
        VALUES (book_seat.train_id, passenger_id, 'Waiting');
    END IF;
END;
$$;
