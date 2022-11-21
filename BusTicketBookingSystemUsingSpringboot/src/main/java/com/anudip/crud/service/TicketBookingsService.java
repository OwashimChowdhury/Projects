package com.anudip.crud.service;

import java.util.List;
import com.anudip.crud.entity.TicketBookings;


public interface TicketBookingsService {

	TicketBookings saveBookings(TicketBookings bookings);
	
	List<TicketBookings> getAllBookings();
		
		//getting details of user based on uid
	TicketBookings getBookingsById(int bookingId);
		
		
		
		//getting details of user based on uid & delete mentioned user
		void deleteBookingById(int bookingId);
		
		
		List<TicketBookings> getBookingsByBusName(String BusName);

		List<TicketBookings> getBookingByStartingBusStand(String startingBusStand);
		
	
}
