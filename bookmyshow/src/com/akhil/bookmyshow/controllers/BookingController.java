package com.akhil.bookmyshow.controllers;

import com.akhil.bookmyshow.dtos.CreateBookingRequestDto;
import com.akhil.bookmyshow.models.Booking;
import com.akhil.bookmyshow.repositories.InMemoryShowSeatRepository;
import com.akhil.bookmyshow.repositories.InMemoryBookingRepository;
import com.akhil.bookmyshow.services.BookingService;

public class BookingController {
	private BookingService bookingService = new BookingService(new InMemoryBookingRepository(),
			new InMemoryShowSeatRepository());

	public CreateBookingResponseDto CreateBooking(CreateBookingRequestDto requestDto) {

		return null;
	}
}


//BookMyShow
//APIs
// /book
// /seats/{show_id}
// /theatres/{city_id}