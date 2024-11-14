//package com.irctc.GCommon;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.irctc.DTO.ReservationTicketDTO;
//
//
//public record ReservedTicket(String id, String name, String trainId){
//	 private static List<ReservedTicket> tickets = Arrays.asList(
//	            new ReservedTicket("ticket-1", "Effective Java", "author-1"),
//	            new ReservedTicket("ticket-2", "Hitchhiker's Guide to the Galaxy", "author-2"),
//	            new ReservedTicket("ticket-3", "Down Under", "author-3")
//	    );
//	 
//	 public static ReservedTicket getById(String id) {
//	        return tickets.stream()
//					.filter(ticket -> ticket.id().equals(id))
//					.findFirst()
//					.orElse(null);
//	    }
//}