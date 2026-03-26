package com.akhil.bookmyshow.models;

import java.util.Date;
import java.util.List;

import com.akhil.bookmyshow.repositories.InMemoryBookingRepository;
import com.akhil.bookmyshow.repositories.InMemoryShowSeatRepository;

public class Booking {
	private User bookedBy;

	public User getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(User bookedBy) {
		this.bookedBy = bookedBy;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Date getTimeOfBooking() {
		return timeOfBooking;
	}

	public List<ShowSeat> getShowSeats() {
		return showSeats;
	}

	public void setShowSeats(List<ShowSeat> showSeats) {
		this.showSeats = showSeats;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public void setTimeOfBooking(Date timeOfBooking) {
		this.timeOfBooking = timeOfBooking;
	}

	private Show show;
	private List<ShowSeat> showSeats;
	private double totalAmount;
	private List<Payment> payments;
	private BookingStatus bookingStatus;
	private Date timeOfBooking;

	// if there is a conflict of booking,allow the request that is booking more
	// seats
}
