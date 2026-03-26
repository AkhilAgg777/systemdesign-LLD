package com.akhil.bookmyshow.dtos;

import java.util.List;

import com.akhil.bookmyshow.models.Show;
import com.akhil.bookmyshow.models.ShowSeat;
import com.akhil.bookmyshow.models.User;

public class CreateBookingRequestDto {

	private Show show;
	private List<Long> showSeatsIds;
	private User user;
	
	public List<Long> getShowSeats() {
		return showSeatsIds;
	}

	public void setShowSeats(List<Long> showSeatIds) {
		this.showSeatsIds = showSeatIds;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Show getShow() {
		return show;
	}
}
