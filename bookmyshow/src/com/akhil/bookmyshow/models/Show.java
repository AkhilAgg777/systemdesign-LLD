package com.akhil.bookmyshow.models;

import java.util.Date;
import java.util.List;

public class Show {
	public Movie movie;
	public Date time;
	public Auditorium auditorium;
	List<ShowSeat> showSeats;
}
