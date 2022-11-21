package com.anudip.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.crud.entity.TicketBookings;

public interface TicketBookingRepository extends JpaRepository<TicketBookings, Integer>{
	//custom query search by bus name
      @Query("select t from TicketBookings t where t.busName= ?1")
	 List<TicketBookings> getBookingsByBusName(String busName) ;
    //custom query search by starting bus standName
      @Query("select t from TicketBookings t where t.fromBusStandName= ?1")
	 List<TicketBookings> getBookingByStartingBusStand(String fromBusStandName) ;
  
	
}
