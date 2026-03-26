package com.akhil.bookmyshow.models;

public class ShowSeatType extends BaseModel {
	private Show show;

	/*
	 * mapping class between show and seat type which also holds information what is
	 * price of that seat for that show
	 */
	private SeatType seatType;
	private double price;

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
