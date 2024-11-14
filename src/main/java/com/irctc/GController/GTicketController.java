//package com.irctc.GController;
//
//import org.springframework.graphql.data.method.annotation.Argument;
//import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
//import org.springframework.stereotype.Controller;
//
//import com.irctc.GCommon.ReservedTicket;
//import com.irctc.GCommon.Train;
//
//@Controller
//public class GTicketController {
//
//	@QueryMapping
//	public ReservedTicket ticketById(@Argument String id) {
//		return ReservedTicket.getById(id);
//	}
//	
//	@SchemaMapping
//	public Train train(String id) {
//		return Train.getById(id);
//	}
//}
