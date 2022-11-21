package com.anudip.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.crud.entity.TicketBookings;
import com.anudip.crud.repository.TicketBookingRepository;
import com.anudip.crud.service.TicketBookingsService;

@Service
public class TicketBookingsServiceimpl implements TicketBookingsService{
	@Autowired
	TicketBookingRepository trepo;

	//save booking details using save method of jpa repo
	@Override
	public TicketBookings saveBookings(TicketBookings bookings) {
		return trepo.save(bookings);
		
	}
	//fetch booking details using findAll method of jpa repo
	@Override
	public List<TicketBookings> getAllBookings() {
		
		return trepo.findAll();
	}
//fetch by booking id 
	@SuppressWarnings("deprecation")
	@Override
	public TicketBookings getBookingsById(int bookingId) {
		return trepo.getById(bookingId);
	}
//delete by booking id 
	@Override
	public void deleteBookingById(int bookingId) {
		trepo.deleteById(bookingId);
	
	}
	//fetch booking details by 	bus name
	@Override
	public List<TicketBookings> getBookingsByBusName(String busName) {
		
		return trepo.getBookingsByBusName(busName);
	}
//fetch booking details by "from bus Stand name"
	@Override
	public List<TicketBookings> getBookingByStartingBusStand(String startingBusStand) {
		return trepo.getBookingByStartingBusStand(startingBusStand);
	}

	

}
